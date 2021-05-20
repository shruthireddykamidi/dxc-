<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>

<!DOCTYPE html>
<html>

<head>
    <title>Dynamically Add Remove Table Rows in JavaScript</title>
    <style>
        table { width: 70%; }
        table, th, td { border: solid 1px #DDD;
            border-collapse: collapse; padding: 2px 3px; text-align: center;

        }
        
form {
  display: flex;
  flex-direction: column;
  align-items: flex-end;
}
p1{display: flex;
  flex-direction: column;
align-items: flex-end;}
    </style>
   <script src=
"https://ajax.googleapis.com/ajax/libs/jquery/2.1.1/jquery.min.js">
    </script>
</head>

<body onload="createTable()" style="background-color:#ADD8E6">


  <form>
    
    Barcode:<input type="text" id="barcode">
    Mobile:<input type="text" id="mobile">
     Qty:<input type ="text" id="qty" value="1"  >
     
      <p1>
        <input type="button" id="addRowbtn" value="Add Data" onclick="addRow()" />
    </p1> </form>
<div id="cont"></div>   <!--the container to add the table.-->
    <p><input type="button" id="bt" onclick = "submit1()" value="Submit Data" /></p>
    
    
    
    
   
</body>

<script>
$("#barcode").keypress(function(event) {
    if (event.keyCode === 13) {
        $("#addRowbtn").click();
    }
});

    var arrHead = new Array();
    var inp = new Array();0
    arrHead = ['', 'Item', 'Price', 'Qty','Total']; // table headers.
    inp = ["rice", 50, 1];
   function show(){
    document.write(finalarr);
    }
    // first create a TABLE structure by adding few headers.
    function createTable() {
        var empTable = document.createElement('table');
        empTable.setAttribute('id', 'empTable');  // table id.

        var tr = empTable.insertRow(-1);

        for (var h = 0; h < arrHead.length; h++) {
            var th = document.createElement('th'); // the header object.
            th.innerHTML = arrHead[h];
            tr.appendChild(th);
        }

        var div = document.getElementById('cont');
        div.appendChild(empTable);    // add table to a container.
    }
    var finalarr = new Array();
    var totalam = 0;
    // function to add new row.
    function addRow() {
        var empTab = document.getElementById('empTable');
        
      // var pr = parseInt(document.getElementById("price").value);
        //var qt = ParseInt(document.getElementById("qty").value	);
        //var tp = pr*qt;
       //inp=[document.getElementById("name").value, document.getElementById("price").value, document.getElementById("qty").value, document.getElementById("price").value*document.getElementById("qty").value];
        //finalarr.push(inp);
        if(document.getElementById("barcode").value==="")
        	{  alert("enter the barcode");
        	        	}
        	  
        	  else{ 
        		   var tempar = findbarcode(document.getElementById("barcode").value);
        		   if(tempar!=0)
        		   {
        		  inp = [tempar[0],tempar[1], document.getElementById("qty").value,tempar[1]*document.getElementById("qty").value];
        		  

        var rowCnt = empTab.rows.length;    // get the number of rows.
        var tr = empTab.insertRow(rowCnt); // table row.
        tr = empTab.insertRow(rowCnt);

        for (var c = 0 ,i=-1; c < arrHead.length; c++,i++) {
            var td = document.createElement('td');          // TABLE DEFINITION.
            td = tr.insertCell(c);

            if (c == 0) {   // if its the first column of the table.
                // add a button control.
                var button = document.createElement('input');

                // set the attributes.
                button.setAttribute('type', 'button');
                button.setAttribute('value', 'Remove');

                // add button's "onclick" event.
                button.setAttribute('onclick', 'removeRow(this)');

                td.appendChild(button);
            }
            else {
                // the 2nd, 3rd and 4th column, will have textbox.
               var ele = document.createElement('input');
               ele.setAttribute('type', 'text');
              
              ele.setAttribute('value', inp[i]);
          
            
              

                td.appendChild(ele);
               
            }
        } }
        		   else
        			   alert("no product found");
        		  		   }
    }
    
    function findbarcode(bar){
    	var barcodes ={"20210518":["Rice",50],"20210519":["Shampoo",2],"20210520":["brush",15],"20210521":["trimmer",1000],"20210522":["bisciut",20],"20210523":["dairymilk",150],"20210524":["fivestar",20],"20210525":["barone",15],"20210526":["scrub",199],"20210527":["hairgel",250],"20210528":["hideandseek",30],"20210529":["massageoil",250],"20210530":["facecream",200],"20210531":["bodylotion",350],"20210532":["comb",40],"20210533":["lipbalm",39],"20210534":["perfume",499],"20210535":["box",20],"20210536":["powder",350],"20210537":["roomfreshner",150]};
    	var x;
    	for(x in barcodes)
    		{
    		  if(x===bar)
    			  {
    			    return barcodes[x];
    			  }
    		}
    	
    return 0;}

    // function to delete a row.
    function removeRow(oButton) {
        var empTab = document.getElementById('empTable');
        empTab.deleteRow(oButton.parentNode.parentNode.rowIndex); // buttton -> td -> tr
    }

    // function to extract and submit table data.
    function submit1() {
        var myTab = document.getElementById('empTable');
        var arrValues = new Array();
        var st = "";
        // loop through each row of the table.
        for (row = 1; row < myTab.rows.length - 1; row++) {
            // loop through each cell in a row.
            for (c = 0; c < myTab.rows[row].cells.length; c++) {
                var element = myTab.rows.item(row).cells[c];
                if (element.childNodes[0].getAttribute('value') != 'Remove') {
                    arrValues.push("'"+element.childNodes[0].value +"'");
                    st += element.childNodes[0].value+"," ;
                }
            }
            //arr.Values.push(" ");
            st += " ";
        }
        
     
          var mob = document.getElementById("mobile").value ;
          
          if(mob!=""){
      
        window.location.replace("generatebill.jsp?bill="+st+"&mobile="+mob);
          }
          else{
        	  alert("mobile number cant be blank");
          } 
    }
    
  
</script>



</html>