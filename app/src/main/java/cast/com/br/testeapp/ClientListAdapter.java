package cast.com.br.testeapp;

import android.app.Activity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.List;

/**
 * Created by Administrador on 20/07/2015.
 */
public class ClientListAdapter extends BaseAdapter {

    private List<Client> clientList;
    private Activity context;

    public ClientListAdapter(Activity context, List<Client> clientList){
        this.context = context;
        this.clientList = clientList;
    }

    @Override
    public int getCount() {
        return this.clientList.size();
    }

    @Override
    public Client getItem(int position) {
        return this.clientList.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View view = context.getLayoutInflater().inflate(R.layout.client_list_item, parent, false);

        TextView textName = (TextView) view.findViewById(R.id.textViewName);
        textName.setText(clientList.get(position).getName());

        TextView textAge = (TextView) view.findViewById(R.id.textViewAge);
        textAge.setText(clientList.get(position).getAge());

        return view;
    }
}
