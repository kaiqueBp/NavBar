package com.kaique.consultoria.ui.sobre;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.kaique.consultoria.R;

import mehdi.sakout.aboutpage.AboutPage;
import mehdi.sakout.aboutpage.Element;


public class SobreFragment extends Fragment {

      public SobreFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
          String descricao = "Na Kaique Consultoria, entendemos que o sucesso de uma empresa é construído sobre alicerces sólidos de estratégia, inovação e liderança. " +
                  "Com uma equipe de especialistas dedicados e uma abordagem personalizada, " +
                  "transformamos desafios em oportunidades e visões em realidades.";

        Element versao = new Element();
        versao.setTitle("Versão 1.0");

          return  new AboutPage(getActivity())
                  .setImage(R.drawable.baseline_info)
                  .setDescription(descricao)
                  .addGroup("Entre em contato")
                  .addEmail("atendimento@kpbconsultoria.com.br", "Envie um email")
                  .addWebsite("","Acesse nosso site")

                  .addGroup("Redes sociais")
                  .addFacebook("","Facebook")
                  .addInstagram("kaique__sk8","Instagram")
                  .addGitHub("kaiqueBp","Github")

                  .addItem(versao)
                  .create();

        // Inflate the layout for this fragment
        //return inflater.inflate(R.layout.fragment_sobre, container, false);
    }
}