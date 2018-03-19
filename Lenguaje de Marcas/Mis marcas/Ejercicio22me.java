<html>
<head>
<title>Mover elementos</title>
<style type="text/css">
#bart1{position:absolute; top:200; left:100;}
#bart2{position:absolute; top:200; left:450;}
#bart3{position:absolute; top:200; left:800;}
</style>
<script languaje="JavaScript">
	objeto=null;
	ejeZ=2;	
	function cargar(){
		if(event.srcElement.tagName == "IMG"){
			objeto = event.srcElement;
			objeto.style.zIndex = ejeZ;
			ejeZ++;
		}
	}
	function descargar(){
		objeto = null;
	}
	function mover(){
		if(objeto != null){
			objeto.style.left = event.x - 100;
			objeto.style.top = event.y - 100;
		}
	}


</script>
</head>
<body onmousedown="cargar(); event.returnValue=false" onmousemove="mover()" onmouseup="descargar()" >
<h1 align=center>Moviendo elementos</h1>
<img src="imagenes/bart1.gif" id="bart1" width="200">
<img src="imagenes/bart2.gif" id="bart2" width="200">
<img src="imagenes/bart3.png" id="bart3" width="120">


</body>

</html>