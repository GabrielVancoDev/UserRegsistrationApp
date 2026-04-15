package com.gabriel.userregsistrationapp;

import android.content.Context;

import androidx.room.Database; //Notação para marcar a classe como um banco de dados Room
import androidx.room.RoomDatabase; // Classe base que representa o BD
public class UserDatabase {
    @Database(entities = {User.class}, version = 1)
    public abstract class UserDatabase extends RoomDatabase {
        // Instância única (singleton) do BD
        private static UserDatabase instance;
        // Método Abstrato que será implementado pela Room
        public abstract UserDao userDao();

        // Método que retorna a instância do BD
        // O uso do "Synchronized" garante que apenas uma thread possa acessar este método por
        //  vez, evitando que duas instâncias do BD sejam criadas acidentalmente
        public static synchronized UserDatabase getInstance(Context context){
            // Verificar se já existe uma instância de DB
            if(instance == null){
                //Cria instancia do BD usando Room
                instance = Room.databasebuilder(
                        context.getApplicationContext(),
                        UserDatabase.class, name:
                "user-database".fallbackToDestructiveMigration().allowMainThreadQueries().builder();

            }
            // Retorna a Instância Criada
            return instance;

        }
    }
}
