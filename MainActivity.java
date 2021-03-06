package Calculator.com.Calculator;

import android.os.Bundle;

import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

        Button button0,button1,button2,button3,button4,button5,button6,button7,button8,button9,buttonAdd,buttonSub,buttonMul,buttonDiv,button10,buttonC,buttonEqual;
        EditText CalcEditText;
        float mValueOne,mValueTwo;
        boolean calcAddition,calcSubtract,calcMul,calDiv;
        @Override
        protected void onCreate(Bundle savedInstanceState){
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_main);
            button0= (Button) findViewById(R.id.button0);
            button1 = (Button) findViewById(R.id.button1);
            button2 = (Button) findViewById(R.id.button2);
            button3 = (Button) findViewById(R.id.button3);
            button4 = (Button) findViewById(R.id.button4);
            button5 = (Button) findViewById(R.id.button5);
            button6 = (Button) findViewById(R.id.button6);
            button7 = (Button) findViewById(R.id.button7);
            button8 = (Button) findViewById(R.id.button8);
            button9 = (Button) findViewById(R.id.button9);
            button10 = (Button) findViewById(R.id.button10);
            buttonAdd = (Button) findViewById(R.id.buttonadd);
            buttonSub = (Button) findViewById(R.id.buttonsub);
            buttonMul = (Button) findViewById(R.id.buttonmul);
            buttonDiv = (Button) findViewById(R.id.buttondiv);
            buttonC = (Button) findViewById(R.id.buttonC);
            buttonEqual = (Button) findViewById(R.id.buttoneql);
            CalcEditText = (EditText) findViewById(R.id.edt1);

            button1.setOnClickListener(new View.OnClickListener(){
                @Override
                public void onClick(View v){
                    CalcEditText.setText(CalcEditText.getText()+"1");
                }
            });
            button2.setOnClickListener(new View.OnClickListener(){
                @Override
                public void onClick(View v){
                    CalcEditText.setText(CalcEditText.getText()+"2");
                }
            });
            button3.setOnClickListener(new View.OnClickListener(){
                @Override
                public void onClick(View v){
                    CalcEditText.setText(CalcEditText.getText()+"3");
                }
            });
            button4.setOnClickListener(new View.OnClickListener(){
                @Override
                public void onClick(View v){
                    CalcEditText.setText(CalcEditText.getText()+"4");
                }
            });
            button5.setOnClickListener(new View.OnClickListener(){
                @Override
                public void onClick(View v){
                    CalcEditText.setText(CalcEditText.getText()+"5");
                }
            });
            button6.setOnClickListener(new View.OnClickListener(){
                @Override
                public void onClick(View v){
                    CalcEditText.setText(CalcEditText.getText()+"6");
                }
            });
            button7.setOnClickListener(new View.OnClickListener(){
                @Override
                public void onClick(View v){
                    CalcEditText.setText(CalcEditText.getText()+"7");
                }
            });
            button8.setOnClickListener(new View.OnClickListener(){
                @Override
                public void onClick(View v){
                    CalcEditText.setText(CalcEditText.getText()+"8");
                }
            });
            button9.setOnClickListener(new View.OnClickListener(){
                @Override
                public void onClick(View v){
                    CalcEditText.setText(CalcEditText.getText()+"9");
                }
            });
            button0.setOnClickListener(new View.OnClickListener(){
                @Override
                public void onClick(View v){
                    CalcEditText.setText(CalcEditText.getText()+"0");
                }
            });
            buttonAdd.setOnClickListener(new View.OnClickListener(){
                @Override
                public void onClick(View v){
                    if(CalcEditText == null)
                    {
                        CalcEditText.setText("");
                    }
                    else {
                        mValueOne=Float.parseFloat(CalcEditText.getText()+"");
                        calcAddition=true;
                        CalcEditText.setText(null);
                    }
                }
            });

            buttonSub.setOnClickListener(new View.OnClickListener(){
                @Override
                public void onClick(View v){
                    mValueOne = Float.parseFloat(CalcEditText.getText()+"");
                    calcSubtract=true;
                    CalcEditText.setText(null);
                }
            });

            buttonMul.setOnClickListener(new View.OnClickListener(){
                @Override
                public void onClick(View v){
                    mValueOne = Float.parseFloat(CalcEditText.getText()+"");
                    calcMul=true;
                    CalcEditText.setText(null);
                }
            });
            buttonDiv.setOnClickListener(new View.OnClickListener(){
                @Override
                public void onClick(View v){
                    mValueOne=Float.parseFloat(CalcEditText.getText()+"");
                    calDiv=true;
                    CalcEditText.setText(null);
                }
            });
            buttonEqual.setOnClickListener(new View.OnClickListener(){
                @Override
                public void onClick(View v){
                    mValueTwo=Float.parseFloat(CalcEditText.getText()+"");
                    if(calcAddition==true){
                        CalcEditText.setText(mValueOne+mValueTwo+"");
                        calcAddition=false;
                    }
                    if(calcSubtract==true){
                        CalcEditText.setText(mValueOne-mValueTwo+"");
                        calcSubtract=false;
                    }
                    if(calcMul==true){
                        CalcEditText.setText(mValueOne*mValueTwo+"");
                        calcMul=false;
                    }
                    if(calDiv==true){
                        CalcEditText.setText(mValueOne/mValueTwo+"");
                        calDiv=false;
                    }
                }
            });
            buttonC.setOnClickListener(new View.OnClickListener(){
                @Override
                public void onClick(View v){
                    CalcEditText.setText("");
                }
            });
            button10.setOnClickListener(new View.OnClickListener(){
                @Override
                public void onClick(View v){
                    CalcEditText.setText(CalcEditText.getText()+".");
                }
            });
        }
}
