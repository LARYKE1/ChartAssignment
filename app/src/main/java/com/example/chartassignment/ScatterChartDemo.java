package com.example.chartassignment;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;

import com.github.mikephil.charting.charts.ScatterChart;
import com.github.mikephil.charting.data.Entry;
import com.github.mikephil.charting.data.ScatterData;
import com.github.mikephil.charting.data.ScatterDataSet;
import com.github.mikephil.charting.utils.ColorTemplate;

import java.util.ArrayList;

public class ScatterChartDemo extends AppCompatActivity {

    ScatterChart scatterChart;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_scatter_chart_demo);

        scatterChart=(ScatterChart) findViewById(R.id.scatterChart);
        ArrayList<Entry> scatterEntries=new ArrayList<>();

        scatterEntries.add(new Entry(10,1321));
        scatterEntries.add(new Entry(15,2321));
        scatterEntries.add(new Entry(20,3221));
        scatterEntries.add(new Entry(30,4321));
        scatterEntries.add(new Entry(40,5321));
        scatterEntries.add(new Entry(50,9321));

        ScatterDataSet dataSet=new ScatterDataSet(scatterEntries,"Report");
        dataSet.setColors(ColorTemplate.COLORFUL_COLORS);
        dataSet.setValueTextColor(Color.BLACK);
        dataSet.setValueTextSize(18f);
        dataSet.setScatterShape(ScatterChart.ScatterShape.CIRCLE);
        dataSet.setScatterShapeSize(25f);

        ScatterData scatterData=new ScatterData(dataSet);
        scatterChart.setData(scatterData);
        scatterChart.animate();

    }
}