package br.senac.go.projetointegrador_2_semestre_2019.source;

import android.app.Application;

public class VeiculoRepository extends Application {

    public static GerenciadorApi apiManager;

    @Override
    public void onCreate() {
        super.onCreate();
        apiManager = GerenciadorApi.getInstance();
    }
}
