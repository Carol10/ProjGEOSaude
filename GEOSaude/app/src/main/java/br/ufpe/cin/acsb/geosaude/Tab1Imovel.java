package br.ufpe.cin.acsb.geosaude;

/**
 * Created by CarolineSaraiva on 14/10/17.
 */

import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.support.v4.app.FragmentTransaction;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.ArrayAdapter;

public class Tab1Imovel extends Fragment {

    Spinner mTipoImovel;
    Spinner mSituacao;
    Spinner mMotivo;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.tab1imovel, container, false);

        mTipoImovel = rootView.findViewById(R.id.tipoImovel);
        mSituacao = rootView.findViewById(R.id.Spinner_situacao);
        mMotivo = rootView.findViewById(R.id.Spinner_motivo);

        ArrayAdapter mArrayAdaptaImovel = ArrayAdapter.createFromResource(this.getActivity(), R.array.Imovel, android.R.layout.simple_spinner_item);
        mTipoImovel.setAdapter(mArrayAdaptaImovel);

        ArrayAdapter mArrayAdaptaSituacao = ArrayAdapter.createFromResource(this.getActivity(),R.array.situacao,android.R.layout.simple_spinner_item);
        mSituacao.setAdapter(mArrayAdaptaSituacao);

        ArrayAdapter mArrayAdaptaMotivo = ArrayAdapter.createFromResource(this.getActivity(), R.array.motivo, android.R.layout.simple_spinner_item);
        mMotivo.setAdapter(mArrayAdaptaMotivo);

        return rootView;
    }


    public void onStart() {
        super.onStart();
        EditText txtDate = (EditText)findViewById(R.id.txtdate);
        txtDate.setOnFocusChangeListener(new View.OnFocusChangeListener());

        public void onFocusChange (View v, boolean hasFocus) {
            if(hasFocus) {
                DateDialog dialog = new DateDialog(v);
                FragmentTransaction ft = getFragmentManager().beginTransaction();
                dialog.show(ft, "DatePricker");
            }
    }
    }
}
