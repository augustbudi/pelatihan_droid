package august.javaclass;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    public String showString;
    public TextView showText;
    public Barang [] arrBarang = new Barang[10];

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        showText = (TextView) findViewById(R.id.show_text);

        showString = "Manipulasi Class Java Android :";
        addSeparator();
        showText.setText(showString);

        initBarang();
        showString += arrBarang[5].toString();
        addSeparator();
        showString += arrBarang[8].toString();
        showText.setText(showString);
    }
    public void addSeparator(){
        showString += "\n------------------------------------------\n";
    }
    public void initBarang(){
        arrBarang[0] = new Barang("Laptop", 1, 7000000);
        arrBarang[1] = new Barang("Printer", Barang.ELETRONIK, 2500000);
        arrBarang[2] = new Barang("Monitor", Barang.ELETRONIK, 3500000);
        arrBarang[3] = new Barang("Meja", Barang.NON_ELETRONIK, 1500000);
        arrBarang[4] = new Barang("Kursi", Barang.NON_ELETRONIK, 2000000);
        arrBarang[5] = new Barang("Lemari", Barang.ELETRONIK, 5500000);
        arrBarang[6] = new Barang("Softcase", Barang.NON_ELETRONIK, 9000000);
        arrBarang[7] = new Barang("Handphone", Barang.ELETRONIK, 2500000);
        arrBarang[8] = new Barang("Sound", Barang.NON_ELETRONIK, 3000000);
        arrBarang[9] = new Barang("CPU", Barang.ELETRONIK, 5000000);
    }
}
