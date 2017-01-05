package com.example.victor.agenda;

import android.widget.EditText;
import android.widget.RatingBar;

import com.example.victor.agenda.modelo.Aluno;

/**
 * Created by victor on 05/12/16.
 */

public class FormularioHelper {

    private EditText campoNome;
    private EditText campoEndereco;
    private EditText campoTelefone;
    private EditText campoSite;
    private RatingBar campoNota;

    private Aluno aluno;

    public FormularioHelper(FormularioActivity activity) {

        this.campoNome = (EditText) activity.findViewById(R.id.formulario_nome);
        this.campoEndereco = (EditText) activity.findViewById(R.id.formulario_endereco);
        this.campoTelefone = (EditText) activity.findViewById(R.id.formulario_telefone);
        this.campoSite = (EditText) activity.findViewById(R.id.formulario_site);
        this.campoNota = (RatingBar) activity.findViewById(R.id.formulario_nota);

        this.aluno = new Aluno();

    }

    public Aluno pegaAluno() {
        this.aluno.setNome(this.campoNome.getText().toString());
        this.aluno.setEndereco(this.campoEndereco.getText().toString());
        this.aluno.setTelefone(this.campoTelefone.getText().toString());
        this.aluno.setSite(this.campoSite.getText().toString());
        this.aluno.setNota(Double.valueOf(this.campoNota.getProgress()));

        return this.aluno;
    }

    public void preencheFormulario(Aluno aluno) {
        this.campoNome.setText(aluno.getNome());
        this.campoEndereco.setText(aluno.getEndereco());
        this.campoTelefone.setText(aluno.getTelefone());
        this.campoSite.setText(aluno.getSite());
        this.campoNota.setProgress(aluno.getNota().intValue());

        this.aluno = aluno;
    }
}
