function calculate(val){
    var res=eval(val);
    document.getElementById("calc_value").value= res;
}

function clear_char(val){
    res= val.substring(0,val.length-1);
    document.getElementById("calc_value").value= res;
}