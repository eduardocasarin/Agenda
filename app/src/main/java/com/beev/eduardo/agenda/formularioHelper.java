package com.beev.eduardo.agenda;

import android.app.Activity;
import android.widget.EditText;
import android.widget.RatingBar;

import com.beev.eduardo.agenda.modelo.Aluno;

/**
 * Created by Eduardo on 17/03/2016.
 */
public class formularioHelper {
    private final EditText nome;
    private final EditText endereco;
    private final EditText telefone;
    private final EditText site;
    private final RatingBar nota;
    private Aluno aluno;

    public formularioHelper(Activity activityFormulario){
         nome = (EditText) activityFormulario.findViewById(R.id.formulario_nome);
         endereco = (EditText) activityFormulario.findViewById(R.id.formulario_endereco);
         telefone = (EditText) activityFormulario.findViewById(R.id.formulario_telefone);
         site = (EditText) activityFormulario.findViewById(R.id.formulario_site);
         nota = (RatingBar) activityFormulario.findViewById(R.id.formulario_nota );
    }


    public Aluno pegaAluno() {
        Aluno aluno = new Aluno();
        aluno.setNome(nome.getText().toString());
        aluno.setEndereco(endereco.getText().toString());
        aluno.setTelefone(telefone.getText().toString());
        aluno.setSite(site.getText().toString());
        aluno.setNota(Double.valueOf(nota.getProgress()));
        return aluno;
    }
}
