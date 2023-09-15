$(document).ready(function(){ 
    $('select').awselect() 
});

function selectState() {
    var endState = document.getElementById('targetUnitID').value
    var selState = document.getElementById('sourceUnitID').value
    var inputID = document.getElementById("inputID").value
    
    if (selState == "kb" && endState == "mb") {
        var outputID = document.getElementById('resultID').innerHTML = inputID * 
    }
    else if (selState == "kb" && endState == "gb") {
        var outputID = document.getElementById('resultID').innerHTML = inputID * 
    }
    else if (selState == "kb" && endState == "tb") {
        var outputID = document.getElementById('resultID').innerHTML = inputID * 
    }
    else if (selState == "kb" && endState == "kib") {
        var outputID = document.getElementById('resultID').innerHTML = inputID * 
    }
    else if (selState == "kb" && endState == "mib") {
        var outputID = document.getElementById('resultID').innerHTML = inputID * 
    }
    else if (selState == "kb" && endState == "gib") {
        var outputID = document.getElementById('resultID').innerHTML = inputID * 
    }
    else if (selState == "kb" && endState == "tib") {
        var outputID = document.getElementById('resultID').innerHTML = inputID * 
    }
    else {
        alert('pls dont')
    }

        outputID = (outputID + " " + endState)
        document.getElementById('resultID').innerHTML = outputID
    
}

