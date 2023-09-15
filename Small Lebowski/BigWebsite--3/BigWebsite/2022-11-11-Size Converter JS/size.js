

function selectState() {
    var endState = document.getElementById('targetUnitID').value
    var selState = document.getElementById('sourceUnitID').value
    var inputID = document.getElementById("inputID").value

    if (selState == "kb" && endState == "mb") {
        var outputID = document.getElementById('resultID').innerHTML = inputID * 0.001
    }
    else if (selState == "kb" && endState == "gb") {
        var outputID = document.getElementById('resultID').innerHTML = inputID * 0.000001
    }
    else if (selState == "kb" && endState == "tb") {
        var outputID = document.getElementById('resultID').innerHTML = inputID * 1000000000
    }
    else if (selState == "kb" && endState == "kib") {
        var outputID = document.getElementById('resultID').innerHTML = inputID * 0.9765625
    }
    else if (selState == "kb" && endState == "mib") {
        var outputID = document.getElementById('resultID').innerHTML = inputID * 0.00095367431640625
    }
    else if (selState == "kb" && endState == "gib") {
        var outputID = document.getElementById('resultID').innerHTML = inputID * 0.0000009313225746154785
    }
    else if (selState == "kb" && endState == "tib") {
        var outputID = document.getElementById('resultID').innerHTML = inputID * 0.0000000009094947017729282
    }

    else if (selState == "mb" && endState == "kb") {
        var outputID = document.getElementById('resultID').innerHTML = inputID * 1000
    }
    else if (selState == "mb" && endState == "gb") {
        var outputID = document.getElementById('resultID').innerHTML = inputID * 0.001
    }
    else if (selState == "mb" && endState == "tb") {
        var outputID = document.getElementById('resultID').innerHTML = inputID * 0.000001
    }
    else if (selState == "mb" && endState == "kib") {
        var outputID = document.getElementById('resultID').innerHTML = inputID * 976.5625
    }
    else if (selState == "mb" && endState == "mib") {
        var outputID = document.getElementById('resultID').innerHTML = inputID * 0.95367431640625
    }
    else if (selState == "mb" && endState == "gib") {
        var outputID = document.getElementById('resultID').innerHTML = inputID * 0.0009313225746154785
    }
    else if (selState == "mb" && endState == "tib") {
        var outputID = document.getElementById('resultID').innerHTML = inputID * 0.0000009094947017729282
    }

    else if (selState == "gb" && endState == "mb") {
        var outputID = document.getElementById('resultID').innerHTML = inputID * 1000
    }
    else if (selState == "gb" && endState == "kb") {
        var outputID = document.getElementById('resultID').innerHTML = inputID * 1000000
    }
    else if (selState == "gb" && endState == "tb") {
        var outputID = document.getElementById('resultID').innerHTML = inputID * 0.001
    }
    else if (selState == "gb" && endState == "kib") {
        var outputID = document.getElementById('resultID').innerHTML = inputID * 976562.5
    }
    else if (selState == "gb" && endState == "mib") {
        var outputID = document.getElementById('resultID').innerHTML = inputID * 953.67431640625
    }
    else if (selState == "gb" && endState == "gib") {
        var outputID = document.getElementById('resultID').innerHTML = inputID * 0.9313225746154785
    }
    else if (selState == "gb" && endState == "tib") {
        var outputID = document.getElementById('resultID').innerHTML = inputID * 0.0009094947017729282
    }

    else if (selState == "tb" && endState == "mb") {
        var outputID = document.getElementById('resultID').innerHTML = inputID * 1000000
    }
    else if (selState == "tb" && endState == "gb") {
        var outputID = document.getElementById('resultID').innerHTML = inputID * 1000
    }
    else if (selState == "tb" && endState == "kb") {
        var outputID = document.getElementById('resultID').innerHTML = inputID * 1000000000
    }
    else if (selState == "tb" && endState == "kib") {
        var outputID = document.getElementById('resultID').innerHTML = inputID * 976562500
    }
    else if (selState == "tb" && endState == "mib") {
        var outputID = document.getElementById('resultID').innerHTML = inputID * 953674.31640625
    }
    else if (selState == "tb" && endState == "gib") {
        var outputID = document.getElementById('resultID').innerHTML = inputID * 931.3225746154785
    }
    else if (selState == "tb" && endState == "tib") {
        var outputID = document.getElementById('resultID').innerHTML = inputID * 0.9094947017729282
    }

    else if (selState == "kib" && endState == "mb") {
        var outputID = document.getElementById('resultID').innerHTML = inputID * 1.024
    }
    else if (selState == "kib" && endState == "gb") {
        var outputID = document.getElementById('resultID').innerHTML = inputID * 0.000001024
    }
    else if (selState == "kib" && endState == "tb") {
        var outputID = document.getElementById('resultID').innerHTML = inputID * 0.000000001024
    }
    else if (selState == "kib" && endState == "kb") {
        var outputID = document.getElementById('resultID').innerHTML = inputID * 0.001024
    }
    else if (selState == "kib" && endState == "mib") {
        var outputID = document.getElementById('resultID').innerHTML = inputID * 0.0009765625
    }
    else if (selState == "kib" && endState == "gib") {
        var outputID = document.getElementById('resultID').innerHTML = inputID * 0.00000095367431640625
    }
    else if (selState == "kib" && endState == "tib") {
        var outputID = document.getElementById('resultID').innerHTML = inputID * 0.0000000009313225746154785
    }

    else if (selState == "mib" && endState == "kb") {
        var outputID = document.getElementById('resultID').innerHTML = inputID * 1048.576
    }
    else if (selState == "mib" && endState == "gb") {
        var outputID = document.getElementById('resultID').innerHTML = inputID * 0.001048576
    }
    else if (selState == "mib" && endState == "tb") {
        var outputID = document.getElementById('resultID').innerHTML = inputID * 0.000001048576
    }
    else if (selState == "mib" && endState == "kib") {
        var outputID = document.getElementById('resultID').innerHTML = inputID * 1024
    }
    else if (selState == "mib" && endState == "mb") {
        var outputID = document.getElementById('resultID').innerHTML = inputID * 1.048576
    }
    else if (selState == "mib" && endState == "gib") {
        var outputID = document.getElementById('resultID').innerHTML = inputID * 0.0009765625
    }
    else if (selState == "mib" && endState == "tib") {
        var outputID = document.getElementById('resultID').innerHTML = inputID * 0.00000095367431640625
    }

    else if (selState == "gib" && endState == "mb") {
        var outputID = document.getElementById('resultID').innerHTML = inputID * 1073.741824
    }
    else if (selState == "gib" && endState == "kb") {
        var outputID = document.getElementById('resultID').innerHTML = inputID * 1073741.824
    }
    else if (selState == "gib" && endState == "tb") {
        var outputID = document.getElementById('resultID').innerHTML = inputID * 0.001073741824
    }
    else if (selState == "gib" && endState == "kib") {
        var outputID = document.getElementById('resultID').innerHTML = inputID * 1048576
    }
    else if (selState == "gib" && endState == "mib") {
        var outputID = document.getElementById('resultID').innerHTML = inputID * 1024
    }
    else if (selState == "gib" && endState == "gb") {
        var outputID = document.getElementById('resultID').innerHTML = inputID * 1.073741824
    }
    else if (selState == "gib" && endState == "tib") {
        var outputID = document.getElementById('resultID').innerHTML = inputID * 0.0009765625
    }

    else if (selState == "tib" && endState == "mb") {
        var outputID = document.getElementById('resultID').innerHTML = inputID * 1099511.627776
    }
    else if (selState == "tib" && endState == "gb") {
        var outputID = document.getElementById('resultID').innerHTML = inputID * 1099.511627776
    }
    else if (selState == "tib" && endState == "kb") {
        var outputID = document.getElementById('resultID').innerHTML = inputID * 1099511627.776
    }
    else if (selState == "tib" && endState == "kib") {
        var outputID = document.getElementById('resultID').innerHTML = inputID * 1073741824
    }
    else if (selState == "tib" && endState == "mib") {
        var outputID = document.getElementById('resultID').innerHTML = inputID * 1048576
    }
    else if (selState == "tib" && endState == "gib") {
        var outputID = document.getElementById('resultID').innerHTML = inputID * 1024
    }
    else if (selState == "tib" && endState == "tb") {
        var outputID = document.getElementById('resultID').innerHTML = inputID * 1.099511627776
    }


    outputID = (outputID + " " + endState)
    document.getElementById('resultID').innerHTML = outputID

}

