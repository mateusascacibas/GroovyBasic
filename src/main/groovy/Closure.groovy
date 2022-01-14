def getName = { name ->
    println "My name is $name"
}

getName("Mateus")

def getListName =["Mateus", "Dayelle", "Tiagao"]

getListStartM = getListName.findAll { it.startsWith("M")}

println(getListName)
println(getListStartM)