



var request2 = new XMLHttpRequest();
request2.open("GET", "/api/cities", true);
request2.onreadystatechange = handleCompletedCitiesRequest;
request2.send(null);



var genBridges = function() {
    var request = new XMLHttpRequest();
    request.open("GET", "/api/bridges", true);
    request.onreadystatechange = handleCompletedRequest;
    request.send(null);

    function handleCompletedRequest() {
        if (request.readyState == 4 && request.status==200) {
            var ourdiv = document.getElementById("bridge_container");
            var bridgeList = JSON.parse(request.responseText);
            var names = "";
            for(var b = 0; b< bridgeList.length; b++)
            {
                names+= "id = " + bridgeList[b].id +" name= " + bridgeList[b].name + " <br>";

            }
            ourdiv.innerHTML = names;
        }
    }
}
genBridges();


function handleCompletedCitiesRequest() {
    if (request2.readyState == 4 && request2.status==200) {
        var ourdiv = document.getElementById("cities_container");
        var cityList = JSON.parse(request2.responseText);
        var names = "";
        for(var b = 0; b< cityList.length; b++)
        {
            names+= cityList[b].city1 +"; ";

        }
        ourdiv.innerHTML += names;
    }
}

var deleteBridge = function() {
    var request = new XMLHttpRequest();
    var id = document.getElementById("bridgeId").value;
    console.log(id);
    var url = "/api/bridges/"+id;
    request.open("DELETE", url, true);
    request.send(null);
    genBridges();
}

var insertBridge = function() {
    var request = new XMLHttpRequest();
    var data = {};
    data.name = document.getElementById("newBridgeName").value;
    data.max_traffic_flow = document.getElementById("newBridgeTraffic").value;
    var json = JSON.stringify(data);


    request.open("POST", "/api/bridges", true);
    request.setRequestHeader("Content-type", "application/json; charset=utf-8");
    request.send(json);
    genBridges();
}
