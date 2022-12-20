<template>
    <div class="container">
        <form id="city">
            <fieldset>
                <div class="alert alert-dismissible alert-warning">
                    <p class="mb-0">Registro de Facturas</p>
                </div>
                <!-- Datos de entarada del formulario -->
                <div class="form-group">
                    <input type="hidden" v-model="id">

                    <label class="form-label mt-1">Código Factura</label>
                    <input type="text" class="form-control" v-model="codigoFactura" placeholder="Ingresar Código Factura">

                    <label class="form-label mt-1">Fecha</label>
                    <input type="date" class="form-control" v-model="fecha">

                    <label class="form-label mt-1">Valor Bruto</label>
                    <input type="text" class="form-control" v-model="valorBruto" placeholder="Ingresar Valor Bruto">

                    <label class="form-label mt-1">Valor Descuento</label>
                    <input type="text" class="form-control" v-model="codigoFactura" placeholder="Ingresar Valor Descuento">

                    <label class="form-label mt-1">Valor Iva</label>
                    <input type="text" class="form-control" v-model="valorIva" placeholder="Ingresar Valor Iva">

                    <label class="form-label mt-1">Valor Neto</label>
                    <input type="text" class="form-control" v-model="valorNeto" placeholder="Ingresar Valor Neto">

                    <label class="form-label mt-1">Usuarios</label>
                    <select class="form-select" v-model="usuarioId">
                        <option disabled :selected="true" value="">-- Seleccione --</option>
                        <option v-for="item in listUser" :key="item.id" :value="item.id">{{ item.usuario}}
                        </option>
                    </select>
                    
                    <label class="form-label mt-1">Estado</label>
                    <select class="form-select" v-model="estado">
                        <option disabled :selected="true" value="">-- Seleccione --</option>
                        <option value="1">Activo</option>
                        <option value="0">Inactivo</option>
                    </select>
                </div>

                <!-- Botones -->
                <div>
                    <br>
                    <button type="button" class="btn btn-outline-success" @click="dataAdd()">Agregar</button>
                    &nbsp;
                    <button type="button" class="btn btn-outline-warning" @click="dataUpdate()">Modificar</button>
                </div>
            </fieldset>
        </form>

        <!-- Registros -->
        <div>
            <br>
            <table class="table table-hover">
                <thead>
                    <tr class="table-active">
                        <td>Codigo Factura</td>
                        <td>Fecha</td>
                        <td>Valor Bruto</td>
                        <td>Valor Descuento</td>
                        <td>Valor Iva/td>
                        <td>Valor Neto</td>
                        <td>Usuario</td>   
                        <td>Estado</td>
                        <td>Editar</td>
                        <td>Eliminar</td>
                    </tr>
                </thead>
                <tbody id="dataResult">
                    <tr v-for="item in listData" :key="item.id">
                        <td>{{ item.codigoFactura }}</td>
                        <td>{{ item.fecha }}</td>
                        <td>{{ item.valorBruto }}</td>
                        <td>{{ item.valorDescuento }}</td>
                        <td>{{ item.valorIva }}</td>
                        <td>{{ item.valorNeto }}</td>
                        <td>{{ item.usuarioId.usuario }}</td>
                        <td>{{ item.estado == true ? 'Activo' : 'Inactivo' }}</td>
                        <td><button @click="findByid(item.id)">➤</button></td>
                        <td><button @click="deleteById(item.id)">➤</button></td>
                    </tr>
                </tbody>
            </table>
        </div>
    </div>
</template>

<script>
import axios from 'axios';
import Swal from 'sweetalert2'

export default {
    name: 'DepartmentView',

    data() {
        return {
            id: 0,
            codigoFactura: '',
            fecha: '',
            valorNeto: '',
            estado: '',
            listData: [],
            listUser:[],
            listValidar: []
        }
    },
    created() {
        this.loadData();
    },
    methods: {
        loadData: function () {
            axios.get('http://150.136.125.111:8080/api/cities').then(result => {
                this.listData = result.data
            })
            axios.get('http://150.136.125.111:8080/api/departments').then(result => {
                this.listUser = result.data
            })
            axios.get('http://150.136.125.111:8080/api/cities').then(result => {
                this.listValidar = result.data
            })
        },
        findByid: function (id) {
            // metodo para consutlar por el ig del boton impreso en la vista
            axios.get('http://150.136.125.111:8080/api/cities/' + id).then(result => {
                this.id = result.data.id;
                this.codigoFactura = result.data.codigoFactura;
                this.fecha = result.data.fecha;
                this.valorNeto = result.data.valorNeto;
                this.usuarioId = result.data.usuarioId.id;
                this.estado = (result.data.estado == true ? 1 : 0);
            })
        },
        deleteById: function (id) {
            // metodo para eliminar el registro por ID
            var bandera = this.validarReferencia(id);
            if (bandera == true) {
                Swal.fire({
                    title: 'Esta usted seguro de eliminar?',
                    text: "No pordrá revertir los cambios!",
                    icon: 'Advertencia',
                    showCancelButton: true,
                    confirmButtonColor: '#3085d6',
                    cancelButtonColor: '#d33',
                    confirmButtonText: 'Si, borrar!'
                }).then((result) => {
                    if (result.isConfirmed) {
                        axios.delete('http://150.136.125.111:8080/api/cities/' + id).then(() => {
                            Swal.fire({
                                icon: 'success',
                                title: "'El registro se eliminó de forma correcta.'",
                                showConfirmButton: false,
                                timer: 1500
                            });
                            this.loadData();
                        })
                    }
                })
            } else {
                Swal.fire({
                    icon: 'error',
                    title: 'Oops...',
                    text: 'Error, registro tiene asociado un permiso al rol.'
                })
            }
        },
        dataAdd: function () {
            let data = {
                codigoFactura: this.codigoFactura,
                fecha: this.fecha,
                valorNeto: this.valorNeto,
                usuarioId:{
                    id:this.usuarioId
                },
                estado: parseInt(this.estado)
            };
            axios.post('http://150.136.125.111:8080/api/cities', data).then(result => {
                if (result.data) {
                    Swal.fire({
                        icon: 'success',
                        title: "'El registro se guardó de forma correcta.'",
                        showConfirmButton: false,
                        timer: 1500
                    });
                    this.loadData();
                    this.clearList();
                }
            });

        },
        dataUpdate: function () {
            let data = {
                id: this.id,
                codigoFactura: this.codigoFactura,
                fecha: this.fecha,
                usuarioId:{
                    id:this.usuarioId
                },
                estado: parseInt(this.estado)
            };
            axios.put('http://150.136.125.111:8080/api/cities/' + this.id, data).then(result => {
                if (result.data) {
                    Swal.fire({
                        icon: 'success',
                        title: "'El registro se guardó de forma correcta.'",
                        showConfirmButton: false,
                        timer: 1500
                    });
                    this.loadData();
                    this.clearList();
                }
            });

        },
        validarReferencia: function (id) {
            var bandera = true;

            this.listValidar.forEach((item, index) => {
                if (item.usuarioId.id == id) {
                    bandera = false
                }
                console.log(index)
            })
            return bandera;

        },
        clearList: function () {
            this.id = 0,
                this.codigoFactura = '',
                this.fecha = '',
                this.valorNeto = '',
                this.estado = '',
                this.listData = []
        }
    }
}
</script>
  