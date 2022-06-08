$(document).ready(function() {
    cargarProductos();
  $('#products').DataTable();
});

async function cargarProductos(){
  const request = await fetch('API/Product/List', {
    method: 'GET',
    headers: {
      'Accept': 'application/json',
      'Content-Type': 'application/json'
    }
  });
  const products = await request.json();

  let listadoHtml ='';
  for(let Products of products){
    let botonUpdate = '<a href="#" onclick="updateProduct('+Products.id+')" class="btn btn-success" btn-circle btn-sn><i class="fas fa-sync-alt"></i></a>';
    let botonEliminar = '<a href="#" onclick="eliminarProduct('+Products.id+')" class="btn btn-warning" btn-circle btn-sn><i class="far fa-trash-alt"></i></a>';
    let usuarioHtml  =  '<tr><td>'+Products.id+'</td><td>'+ Products.name +'</td><td>'+Products.price+'</td><td>'+Products.numberLote
                        +'</td><td>'+Products.cantidadDisponible +'</td><td>'+Products.fechaIngreso+'</td>><td>'+botonUpdate+'</td><td>'+botonEliminar+'</td></tr>';
    listadoHtml += usuarioHtml;
  }

document.querySelector('#products tbody').outerHTML=listadoHtml;


}


async function eliminarProduct(id){
    if(!confirm('¿ Desea Eliminar El Usuario Del Sistema ?')){
        return;
    }

  const request = await fetch('API/Product/Delete/'+ id ,{
    method: 'DELETE',
    headers: {
      'Accept': 'application/json',
      'Content-Type': 'application/json'
    }
  });

  location.reload()
}

async function updateProduct(id){

  const request = await fetch('API/Product/Update/'+ id ,{
    method: 'PUT',
    headers: {
      'Accept': 'application/json',
      'Content-Type': 'application/json'
    }
  });

  window.location.href='product-update.html'
}

