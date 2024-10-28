package com.dam_application; // Paquete que contiene la aplicación.

import android.content.Intent;
import android.os.Bundle; // Importa la clase Bundle, que permite pasar datos entre actividades.
import android.view.View; // Importa la clase View para manejar eventos de clic.

import androidx.activity.EdgeToEdge; // Importa la funcionalidad EdgeToEdge.
import androidx.appcompat.app.AppCompatActivity; // Importa la clase base para actividades de la app.

public class MainActivity extends AppCompatActivity { // Clase principal de la actividad.

    @Override
    protected void onCreate(Bundle savedInstanceState) { // Metodo que se llama al crear la actividad.
        super.onCreate(savedInstanceState); // Llama al metodo onCreate de la clase padre.
        EdgeToEdge.enable(this); // Habilita el diseño sin bordes para la actividad.
        setContentView(R.layout.activity_main); // Establece el contenido de la vista al layout definido en activity_main.xml.

        // Configura el botón para que inicie la nueva actividad al ser pulsado.
        findViewById(R.id.btn_actividad_siguiente).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) { // Metodo que se llama al pulsar el botón.
                // Muestra un Toast para informar al usuario que se va a otra actividad.
                //Toast.makeText(ActividadMain.this, "Vamos a otra actividad", Toast.LENGTH_LONG).show(); // Crea y muestra un Toast largo.

                // Crea un Intent para iniciar la nueva actividad.
                // De momento lo vamos a tener comentado
                // Tarea de hoy crear una nueva actividad desde el menu
                // que se va a llamar NuevaActividad
                // luego refactorizamos y cambiamos el nombre
                Intent intent = new Intent(MainActivity.this, ChildActivity.class);
                startActivity(intent); // Inicia la nueva actividad.
            }
        });

        findViewById(R.id.btn_actividad_test).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, TestActivity.class);
                startActivity(intent);
            }
        });
    }
}

