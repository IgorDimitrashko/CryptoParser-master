package com.easylabs.cryptoparserday;

import android.graphics.Color;
import android.os.AsyncTask;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import org.json.JSONObject;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

public class MainActivity extends AppCompatActivity {
    // Раз в 1 мин. получать значения цены криптовалют:
    // BTC, XPR, ETH, OMG, XRB, BNB, HSR, STAR, NAS, BCC.
    // Данные будем брать с API. Данные получаем в json, и парсим.


    Coin[] coins = new Coin[10];
    TextView[] tvNames = new TextView[10];
    TextView[] tvValues = new TextView[10];
    TextView[] tvDivs = new TextView[10];
    LinearLayout[] llCoins = new LinearLayout[10];

    TextView tvName1;
    TextView tvName2;
    TextView tvName3;
    TextView tvName4;
    TextView tvName5;
    TextView tvName6;
    TextView tvName7;
    TextView tvName8;
    TextView tvName9;
    TextView tvName10;

    TextView tvValue1;
    TextView tvValue2;
    TextView tvValue3;
    TextView tvValue4;
    TextView tvValue5;
    TextView tvValue6;
    TextView tvValue7;
    TextView tvValue8;
    TextView tvValue9;
    TextView tvValue10;

    TextView tvDiv1;
    TextView tvDiv2;
    TextView tvDiv3;
    TextView tvDiv4;
    TextView tvDiv5;
    TextView tvDiv6;
    TextView tvDiv7;
    TextView tvDiv8;
    TextView tvDiv9;
    TextView tvDiv10;
    LinearLayout llCoin1;
    LinearLayout llCoin2;
    LinearLayout llCoin3;
    LinearLayout llCoin4;
    LinearLayout llCoin5;
    LinearLayout llCoin6;
    LinearLayout llCoin7;
    LinearLayout llCoin8;
    LinearLayout llCoin9;
    LinearLayout llCoin10;

    LinearLayout LLCoins;

    // Кнопка, отвечающая за добавления новой монеты
  //  Button btAddCoin;
    // Поле для ввода названия монеты для добавления
  //  EditText etNewCoin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Инициализация View-компонентов
        tvName1 = (TextView) findViewById(R.id.tvName1);
        tvName2 = (TextView) findViewById(R.id.tvName2);
        tvName3 = (TextView) findViewById(R.id.tvName3);
        tvName4 = (TextView) findViewById(R.id.tvName4);
        tvName5 = (TextView) findViewById(R.id.tvName5);
        tvName6 = (TextView) findViewById(R.id.tvName6);
        tvName7 = (TextView) findViewById(R.id.tvName7);
        tvName8 = (TextView) findViewById(R.id.tvName8);
        tvName9 = (TextView) findViewById(R.id.tvName9);
        tvName10 = (TextView) findViewById(R.id.tvName10);

        tvValue1 = (TextView) findViewById(R.id.tvValue1);
        tvValue2 = (TextView) findViewById(R.id.tvValue2);
        tvValue3 = (TextView) findViewById(R.id.tvValue3);
        tvValue4 = (TextView) findViewById(R.id.tvValue4);
        tvValue5 = (TextView) findViewById(R.id.tvValue5);
        tvValue6 = (TextView) findViewById(R.id.tvValue6);
        tvValue7 = (TextView) findViewById(R.id.tvValue7);
        tvValue8 = (TextView) findViewById(R.id.tvValue8);
        tvValue9 = (TextView) findViewById(R.id.tvValue9);
        tvValue10 = (TextView) findViewById(R.id.tvValue10);

        tvDiv1 = (TextView) findViewById(R.id.tvDiv1);
        tvDiv2 = (TextView) findViewById(R.id.tvDiv2);
        tvDiv3 = (TextView) findViewById(R.id.tvDiv3);
        tvDiv4 = (TextView) findViewById(R.id.tvDiv4);
        tvDiv5 = (TextView) findViewById(R.id.tvDiv5);
        tvDiv6 = (TextView) findViewById(R.id.tvDiv6);
        tvDiv7 = (TextView) findViewById(R.id.tvDiv7);
        tvDiv8 = (TextView) findViewById(R.id.tvDiv8);
        tvDiv9 = (TextView) findViewById(R.id.tvDiv9);
        tvDiv10 = (TextView) findViewById(R.id.tvDiv10);

     /*   llCoin1 = (LinearLayout) findViewById(R.id.llCoin1);
        llCoin2 = (LinearLayout) findViewById(R.id.llCoin2);
        llCoin3 = (LinearLayout) findViewById(R.id.llCoin3);
        llCoin4 = (LinearLayout) findViewById(R.id.llCoin4);
        llCoin5 = (LinearLayout) findViewById(R.id.llCoin5);
        llCoin6 = (LinearLayout) findViewById(R.id.llCoin6);
        llCoin7 = (LinearLayout) findViewById(R.id.llCoin7);
        llCoin8 = (LinearLayout) findViewById(R.id.llCoin8);
        llCoin9 = (LinearLayout) findViewById(R.id.llCoin9);
        llCoin10 = (LinearLayout) findViewById(R.id.llCoin10);

        // Привязываем обработчики на нажатие

        llCoin1.setOnClickListener(onCoinClickListener);
        llCoin2.setOnClickListener(onCoinClickListener);
        llCoin3.setOnClickListener(onCoinClickListener);
        llCoin4.setOnClickListener(onCoinClickListener);
        llCoin5.setOnClickListener(onCoinClickListener);
        llCoin6.setOnClickListener(onCoinClickListener);
        llCoin7.setOnClickListener(onCoinClickListener);
        llCoin8.setOnClickListener(onCoinClickListener);
        llCoin9.setOnClickListener(onCoinClickListener);
        llCoin10.setOnClickListener(onCoinClickListener);

        LLCoins = (LinearLayout) findViewById(R.id.llCoins);

        btAddCoin = (Button) findViewById(R.id.btAddCoin);
        btAddCoin.setOnClickListener(onButtonAddCoinClickListener);
        etNewCoin = (EditText) findViewById(R.id.etNewCoin); */

        coins[0] = new Coin("BTC");
        coins[1] = new Coin("XRP");
        coins[2] = new Coin("ETH");
        coins[3] = new Coin("OMG");
        coins[4] = new Coin("XRB");
        coins[5] = new Coin("BNB");
        coins[6] = new Coin("HSR");
        coins[7] = new Coin("STRAT");
        coins[8] = new Coin("NAS");
        coins[9] = new Coin("BCC");


        tvNames[0] = tvName1;
        tvNames[1] = tvName2;
        tvNames[2] = tvName3;
        tvNames[3] = tvName4;
        tvNames[4] = tvName5;
        tvNames[5] = tvName6;
        tvNames[6] = tvName7;
        tvNames[7] = tvName8;
        tvNames[8] = tvName9;
        tvNames[9] = tvName10;

        tvValues[0] = tvValue1;
        tvValues[1] = tvValue2;
        tvValues[2] = tvValue3;
        tvValues[3] = tvValue4;
        tvValues[4] = tvValue5;
        tvValues[5] = tvValue6;
        tvValues[6] = tvValue7;
        tvValues[7] = tvValue8;
        tvValues[8] = tvValue9;
        tvValues[9] = tvValue10;

        tvDivs[0] = tvDiv1;
        tvDivs[1] = tvDiv2;
        tvDivs[2] = tvDiv3;
        tvDivs[3] = tvDiv4;
        tvDivs[4] = tvDiv5;
        tvDivs[5] = tvDiv6;
        tvDivs[6] = tvDiv7;
        tvDivs[7] = tvDiv8;
        tvDivs[8] = tvDiv9;
        tvDivs[9] = tvDiv10;

        llCoins[0] = llCoin1;
        llCoins[1] = llCoin2;
        llCoins[2] = llCoin3;
        llCoins[3] = llCoin4;
        llCoins[4] = llCoin5;
        llCoins[5] = llCoin6;
        llCoins[6] = llCoin7;
        llCoins[7] = llCoin8;
        llCoins[8] = llCoin9;
        llCoins[9] = llCoin10;


        // Создаём асинхронный поток
        RequestGetCoinsCost requestGetCoinsCost =
                new RequestGetCoinsCost();
        // Запускаем его
        requestGetCoinsCost.execute();

        createCoinLL();
    }

    private void createCoinLL() {
    }

    // Отображаем инф. о монетах на экран
    private void showCoins() {
        for (int i = 0; i < coins.length; i++) {
            tvNames[i].setText(coins[i].getName());
            tvValues[i].setText(coins[i].getValue() + "$");
            double div = coins[i].getDiv();
            // Отображать только два знака после запятой
            String divString = String.format("%.2f", div);
            // 0.0224215363624371235161
            // 0.02
            if (div < 0) {
                // Изменяем цвет текса текстового поля на красный
                tvDivs[i].setTextColor(Color.parseColor("#ff0000"));
                tvDivs[i].setText(divString + "%");
            } else if (div == 0) {
                // Изменяем цвет текса текстового поля на красный
                tvDivs[i].setTextColor(Color.parseColor("#f1f1f1"));
                tvDivs[i].setText(divString + "%");
            } else {
                // Изменяем цвет текса текстового поля на зеленый
                tvDivs[i].setTextColor(Color.parseColor("#008000"));
                tvDivs[i].setText("+" + divString + "%");
            }
        }
    }

    // Метод для получения информации о текущем курсе криптовалют на сервисе https://coinmarketcap.com/
    public double coinmarketRequset(String coinName) {
        String url = "https://min-api.cryptocompare.com/data/price?fsym=" + coinName + "&tsyms=USD";
        String responseData;

        try {
            // Указываем адрес для отправки запроса
            URL obj = new URL(url);
            // Открываем соединение
            HttpURLConnection con = (HttpURLConnection) obj.openConnection();
            // Строка, которая будет содержать ответ от сервера
            responseData = "";
            // Код ответа от сервера
            int responseCode;

            // Указываем тип запроса
            con.setRequestMethod("GET");

            responseCode = con.getResponseCode();
            System.out.println("nSending 'GET' request to URL : " + "https://min-api.cryptocompare.com/data/price?fsym=BTC&tsyms=USD");
            System.out.println("Response Code : " + responseCode);

            // Открываем поток для приема данных от сервера
            BufferedReader in = new BufferedReader(
                    new InputStreamReader(con.getInputStream()));
            String output;
            StringBuffer response = new StringBuffer();

            // Считываем входящие данные
            while ((output = in.readLine()) != null) {
                response.append(output);
                System.out.println(output);
            }
            in.close();

            // Преобразовываем StringBuffer в String
            responseData = response.toString();
            // Создаём объект типа JSON
            JSONObject jsonObject = new JSONObject(responseData);
            double cost = Double.parseDouble(jsonObject.get("USD").toString());

            return cost;
        } catch (Exception e) {
            e.printStackTrace();

            return -1;
        }
    }

    // Асинхронный поток для получения информации о значениях криптовалют
    class RequestGetCoinsCost extends AsyncTask<Void, Void, Void> {
        // Выполняет работу в фоновом потоке
        // НЕ ИМЕЕТ ДОСТУПА К GUI
        @Override
        protected Void doInBackground(Void... voids) {
            boolean flag = true;

            // Получаем информацию о валютах
            while (flag) {
                for (int i = 0; i < coins.length; i++) {
                    double cost = coinmarketRequset(coins[i].getName());
                    coins[i].setValue(cost);
                }
                // Это вызов метода onProgressUpdate
                publishProgress();

                // Делаем задержку, между запросами
                try {
                    Thread.sleep(10000);
                } catch (Exception ex) {
                    ex.printStackTrace();
                }
            }

            return null;
        }

        @Override
        protected void onProgressUpdate(Void... values) {
            // Выводим информацию о криптовалютах на экран
            showCoins();
            super.onProgressUpdate(values);
        }
    }
}

/*
    // Асинхронный поток для  получения информации об одной криптовалюте
    class RequestOneCoinPrice extends AsyncTask<Void, Void, Void> {
        @Override
        protected Void doInBackground(Void... voids) {
            // Получаем курс одном монеты
            // Получаем по индексу indexOneCoin монету, получаем её имя
            // и запрашиваем её курс
            double cost = coinmarketRequset(coins[indexOneCoin].getName());
            // Изменяем значения текущего курса для монеты
            // под индексом indexOneCoin
            coins[indexOneCoin].setValue(cost);

            return null;
        }

        @Override
        protected void onPostExecute(Void aVoid) {
            // Отображаем информацию о всех монетах
            showCoins();
            String coinName = coins[indexOneCoin].getName();
            Toast.makeText(MainActivity.this,
                    "Получили курс - " + coinName,
                    Toast.LENGTH_SHORT).show();
            super.onPostExecute(aVoid);
        }
    }

    // Асинхронный поток для  получения информации об одной криптовалюте
    class RequestOneCoinPriceName extends AsyncTask<Void, Void, Void> {
        double cost = 0;

        @Override
        protected Void doInBackground(Void... voids) {
            // Получаем курс одном монеты
            // Если монета с именем coinName существует, то метод вернет её значение
            // если монеты с таким именем нет, метод вернет -1
            cost = coinmarketRequset(coinName);

            return null;
        }

        // Выполняется после doInBackground
        @Override
        protected void onPostExecute(Void aVoid) {
            // Если cost < 0, то валюты с именем coinName нет
            if (cost < 0) {
                Toast.makeText(MainActivity.this, "Ошибка", Toast.LENGTH_SHORT).show();
                // Иначе, если cost >=0 то валюта с таким именем есть
            } else {
                Toast.makeText(MainActivity.this, "Ошибки не было", Toast.LENGTH_SHORT).show();
                // Добавить логику добавления монеты в список
            }

            // После того, как мы получили ответ по запрошенному имени монеты
            // скрыть поле для ввода имени новой монеты
            etNewCoin.setVisibility(View.GONE);

            super.onPostExecute(aVoid);
        }
    }

    int indexOneCoin = 0;
    String coinName;

    View.OnClickListener onCoinClickListener = new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            // view - объект на котором было совершенн нажатие
            int index = -1;

            // llCoins в котором содержится информация о всех контейнерах
            // LinearLayout с монетами
            for (int i = 0; i < llCoins.length; i++) {
                // Если текущий контейнер LinearLayout по индексу i,
                // соотв. объекту на котором было соверщенно нажатие
                // то присвоить его индекс переменной index
                // и  завершить выполнение цикла
                if (llCoins[i].equals(view)) {
                    index = i;
                    break;
                }
            }

            // Если не нашли вхождение объекта в массив
            // Не нашли контейнера на который нажимали в массиве
            // Делаем завершение выполнение метода
            if (index == -1) return;

            // Переменной класса indexOneCoin присваиваем значение переменной index
            indexOneCoin = index;

            // Ассинхронный поток, для получения информации о одной монете
            RequestOneCoinPrice requestOneCoinPrice =
                    new RequestOneCoinPrice();
            // Помещается в очередь на выполнение
            // По-умолчанию, все асинхронные потоки,
            // выполняются по принципу
            // Создается поток 1, срок жизни которого равен 10 секунд, и запускается поток на выполение
            // Через 3 сек. создаем асинхр. поток 2, и запускаем его.
            // Поток 2, не будет выполняться вовсе., если при его вызове использовался
            // след. синтаксис: asyncTaskName.execute();
            // Если Вам необходимо, чтобы задачи выполнялись "парралельно",
            // то при вызове потока на исполнения необходимо применять
            // синтаксис:
            // asyncTaskName.executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR);
            requestOneCoinPrice.executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR);

            // 1 - изначально
            // x - потоков может быть
            // > x && RAM.ISFree() --> x*y
            // 127 потоков
        }
    };

    // Метод обработичка на нажатие на кнопку "добаваить монету"
    View.OnClickListener onButtonAddCoinClickListener =
            new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    // etNewCoin.getVisibility() - получаем статус видимости компонента
                    // View.GONE - компонент не виден, и не занимает место в контейнере
                    // View.VISIBLE - компонент виден, и занимает место в контейнере
                    if (etNewCoin.getVisibility() == View.GONE) {
                        etNewCoin.setVisibility(View.VISIBLE);
                    } else {
                        // Считывем текст с поля для ввода
                        String etNewCoinText = etNewCoin.getText().toString();

                        // Если строка etNewCoinText пуста, то выводим сообщение
                        // что строка пуста, и делаем возврат из метода
                        if (etNewCoinText.isEmpty()) {
                            Toast.makeText(MainActivity.this,
                                    "Enter some coin name",
                                    Toast.LENGTH_SHORT).show();
                            return;
                        }

                        // Переменной класса coinName присваиваем значения текста
                        // с текстового поля, возведенное в верхний регистр
                        // btc - error
                        // BTC - JSON
                        // BTC, btc, Btc
                        // toUpperCase() - метод для возведения строки к верхнему регистру
                        coinName = etNewCoinText.toUpperCase();

                        // Запрашиваем курс одной монеты, по её имени
                        // если мы курс получаем, то добавляем монету
                        // иначе, если мы получаем ощибку то выводим на экран,что всё очень плохо
                        RequestOneCoinPriceName requestOneCoinPriceName =
                                new RequestOneCoinPriceName();
                        requestOneCoinPriceName.executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR);

                        // etNewCoin.setVisibility(View.GONE);
                    }
                }
            };


    void method() {
        // добавляем на кнопку обработчик на нажатие
        button.setOnClickListener(onButtonDivClickListener);
    }

    // Кнопка к которой будем добавлять обработчик на нажатие
    Button button = new Button(this);

    // Обработчик на нажатие
    View.OnClickListener onButtonDivClickListener =
            new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    // Прописываем логику при нажатии на кнопку
                }
            };
            }*/

