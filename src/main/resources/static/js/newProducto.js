$(document).ready(function() {


});


async function registrarProduct(){
    let datos={};
    datos.name= document.getElementById('txtName').value;
    datos.price= document.getElementById('txtPrice').value;
    datos.numberLote= document.getElementById('txtNumberLote').value;
    datos.cantidadDisponible= document.getElementById('txtCantidadDisponible').value;
    datos.fechaIngreso= document.getElementById('txtFechaIngreso').value;

  const request = await fetch('API/Product/Save', {
    method: 'POST',
    headers: {
      'Accept': 'application/json',
      'Content-Type': 'application/json'
    },
      body: JSON.stringify(datos)
  });


  window.location.href='product-new.html'

}