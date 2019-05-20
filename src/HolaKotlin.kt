
fun main(args: Array<String>){

    var recetario: String? = ""
    var opcion: Int = 0
    val ingredientes: List<String> = listOf("agua", "Leche", "Carne", "Verduras", "Frutas", "cereal", "Huevos", "Aceite")

    do {

        //selecciona opcion para ejercer del programa
        println("Selecciona la opcion deseada")
        println("1. Hacer una receta\n2. Ver mi recetario\n3. Salir\n")
        print("# opcion: ")

        //no permite seguir hasta que no ingrese numero valido
        do{
            opcion = readLine()!!.toInt()
        }while (opcion>3 || opcion<1)

        //
        if(opcion == 1){
            //titulo de la receta
            print("\nTitulo de la nueva recetario: ")
            recetario += readLine() + "\n"

            //ingredientes

                println("Que ingredientes tendra?")
                println("""
                1.Agua
                2.Leche
                3.Carne
                4.Verduras
                5.Frutas
                6.Cereal
                7.Huevos
                8.Aceite
                9.Dejar de meter ingredientes
            """.trimIndent())
            do {
                println("Opcion #:")
                var ingrediente = 0
                //validar dato valido
                do{
                    ingrediente = readLine()!!.toInt()
                }while (ingrediente>9 || ingrediente<1)

                //pedir concatenar el valor de la lista ingredientes en la receta
                if(ingrediente!=9)
                    recetario += ingredientes[ingrediente!!.minus(1)] + " "


            }while (ingrediente!=9)
            recetario += "\n\n\n\n"

        }else if (opcion == 2){
            print(recetario)

        }



    }while (opcion!=3)
    println("Bai")

}
