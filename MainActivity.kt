package com.example.tp_integrador

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }
}
//El grupo deberá desarrollar una aplicación móvil que permita a los usuarios comparar dos
// inversiones.
// Cada inversión tendrá parámetros como el monto inicial, la tasa de interés y el tiempo de
// inversión.
// La aplicación calculará y comparará el rendimiento de las dos inversiones, mostrando los
// resultados
// de manera clara. Los datos deben ser persistentes entre sesiones utilizando Shared Preferences.
// Además, se utilizarán Intents para la navegación entre pantallas y Toast para notificaciones. El
// diseño de la interfaz debe estar basado en LinearLayout anidado.
//
//Análisis Funcional
//Descripción de la Aplicación
//
//Ingreso de Datos de Inversión: La aplicación mostrará una pantalla donde los usuarios podrán
// ingresar el monto, la tasa de interés, el plazo y la entidad de ambas inversiones. Estas
// inversiones pueden ser de tipo plazo fijo o fondo común de inversión.
//
//Cálculo de Rendimiento: En una segunda pantalla, se calculará el rendimiento de ambas inversiones
// utilizando el ROI. Además, se simularán los resultados y se proporcionará una recomendación sobre
// cuál es la mejor opción de inversión.
//
//Historial de Comparaciones: Se implementará un tercer botón que permitirá a los usuarios acceder a
// un historial de las últimas cinco comparaciones realizadas.
//
//Políticas y Términos: Un cuarto botón redirigirá a otra actividad donde se presentarán las
// políticas, términos y condiciones de uso de la aplicación.
//
//Test del Inversor: Al instalar la aplicación por primera vez, se llevará a cabo el Test del
// Inversor. Este consistirá en preguntas de opción múltiple, de las cuales el grupo deberá
// seleccionar tres para mostrarlas en la aplicación (más información disponible en:
// https://www.bna.com.ar/Personas/TestDelInversor). Además, se solicitará el nombre, apellido y
// correo electrónico del usuario, que se mostrarán en la pantalla de bienvenida.

//activity 1 loginActivity
//ingreso de datos de usuario(Leil)

//activity 2 tycActivity
//TyC(Lei)

//activity 3 testActivity
// test de inversor (Fer)

//activity 4 buttonsActivity
//boton para ir a comparar, boton para ver historial y boton para desloguearse (Annita)

//activity 5 resultActivity
//ingreso de los parametros de ambas inversiones (boton de comparacion) y
//devolucion de resultado(incluir boton de historial)(Brunito)

//activity 6 historyActivity
//registro de historial de las ultimas 5 devoluciones (maru)




