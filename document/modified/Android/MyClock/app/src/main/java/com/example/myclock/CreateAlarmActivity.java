package com.example.myclock;

import android.content.Intent;
import android.icu.util.Calendar;
import android.os.Bundle;
import android.provider.AlarmClock;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import org.w3c.dom.Attr;
import org.w3c.dom.CDATASection;
import org.w3c.dom.Comment;
import org.w3c.dom.DOMConfiguration;
import org.w3c.dom.DOMException;
import org.w3c.dom.DOMImplementation;
import org.w3c.dom.Document;
import org.w3c.dom.DocumentFragment;
import org.w3c.dom.DocumentType;
import org.w3c.dom.Element;
import org.w3c.dom.EntityReference;
import org.w3c.dom.NamedNodeMap;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.w3c.dom.ProcessingInstruction;
import org.w3c.dom.Text;
import org.w3c.dom.UserDataHandler;
import org.xml.sax.SAXException;

import java.io.IOException;
import java.util.ArrayList;

public class CreateAlarmActivity extends AppCompatActivity implements Document {
    String[] alarmTitleArray={"第","节","课","下","放学","了","早","中","晚","餐","一","二","三","四","五","六","七","八","九","十","十一","十二",};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_create_alarm);
    }
    protected void onStart() {
        super.onStart();
        Log.d("CreateAlarmActivity", "onStart");
    }
    protected void onResume() {
        super.onResume();
        Log.d("CreateAlarmActivity", "onResume");
    }
    protected void onPause() {
        super.onPause();
        Log.d("CreateAlarmActivity", "onPause");
    }
    protected void onStop() {
        super.onStop();
        Log.d("CreateAlarmActivity", "onStop");
    }
    protected void onRestart() {
        super.onRestart();
        Log.d("CreateAlarmActivity", "onRestart");
    }
    protected void onDestroy() {
        super.onDestroy();
        Log.d("CreateAlarmActivity", "onDestroy");
    }
    public void createAlarm(String title, int hours, int minutes) throws InterruptedException {

        ArrayList arrayList=new ArrayList();

        arrayList.add(Calendar.MONDAY);
        arrayList.add(Calendar.TUESDAY);
        arrayList.add(Calendar.WEDNESDAY);
        arrayList.add(Calendar.THURSDAY);
        arrayList.add(Calendar.FRIDAY);
        arrayList.add(Calendar.SATURDAY);

        String strImage="/storage/emulated/0/Pictures/IMG_20230314_132447.jpg";
        //"content://settings/system/alarm_alert
        Intent intent = new Intent(AlarmClock.ACTION_SET_ALARM)
                .putExtra(AlarmClock.EXTRA_MESSAGE, title)
                .putExtra(AlarmClock.EXTRA_HOUR, hours)
                .putExtra(AlarmClock.EXTRA_MINUTES, minutes)
                //.putExtra(AlarmClock.EXTRA_RINGTONE,"电子计时器")
                .putExtra(AlarmClock.EXTRA_VIBRATE,true)
                .putExtra(AlarmClock.EXTRA_DAYS,arrayList)
                //.putExtra(AlarmClock.EXTRA_SKIP_UI,false)
                .putExtra(AlarmClock.EXTRA_SKIP_UI,true)
                ;

        startActivity(intent);

        /*Thread.currentThread().sleep(1500);
        ActivityManager activityManager=getSystemService(ActivityManager.class);
        List<ActivityManager.AppTask> appTaskList=activityManager.getAppTasks();
        appTaskList.get(0).moveToFront();
        Thread.currentThread().sleep(1000);*/

    }
    public void dismissAlarm()  {

        Intent intent = new Intent(AlarmClock.ACTION_DISMISS_ALARM)
                .putExtra(AlarmClock.EXTRA_MESSAGE, "title")
                .putExtra(AlarmClock.EXTRA_ALARM_SEARCH_MODE,AlarmClock.ALARM_SEARCH_MODE_LABEL)
                //.putExtra(AlarmClock.EXTRA_ALARM_SEARCH_MODE, "android.label")
                ;

        startActivity(intent);
    }
    public void snoozeAlarm()  {

        Intent intent = new Intent(AlarmClock.ACTION_SNOOZE_ALARM)
                .putExtra(AlarmClock.EXTRA_ALARM_SNOOZE_DURATION, 5)
                ;

        startActivity(intent);
    }
    public void parseDocument(String url) throws IOException, SAXException {
        MyDocumentBuilder myDocumentBuilder=new MyDocumentBuilder();
        Document document=myDocumentBuilder.parse(url);
        System.out.println(document.getTextContent());
    }
    public int[] getSunsetTime(){
        int[] intArray=new int[2];
        String strSunsetTime_HOURS=((EditText) findViewById(R.id.editTextNumber2)).getText().toString();
        StringToIntTypeCast stringToIntTypeCast=new StringToIntTypeCast(strSunsetTime_HOURS);
        int SunsetTime_HOURS=stringToIntTypeCast.intA;
        String strSunsetTime_MINUTES=((EditText) findViewById(R.id.editTextNumber3)).getText().toString();
        StringToIntTypeCast stringToIntTypeCast_1=new StringToIntTypeCast(strSunsetTime_MINUTES);
        int SunsetTime_MINUTES=stringToIntTypeCast_1.intA;
        intArray[0]=SunsetTime_HOURS;
        intArray[1]=SunsetTime_MINUTES;
        return  intArray;

        //findViewById(R.id.editTextNumber2) as EditText;
        /*
        int SunsetTime_SECONDS=0;*/



        /*WebView webView=new WebView(getApplicationContext());
        String weatherString="https://weathernew.pae.baidu.com/weathernew/pc?query=%E6%B2%B3%E5%8D%97%E9%83%91%E5%B7%9E%E5%A4%A9%E6%B0%94&srcid=4982&forecast=long_day_forecast";
        webView.loadUrl(weatherString);*/

    }
    public void computeTime(int SunsetTime_HOURS, int SunsetTime_MINUTES) throws InterruptedException {
        int SunsetTime_HOURS_1=SunsetTime_HOURS;
        int SunsetTime_MINUTES_1=SunsetTime_MINUTES;
        for (int i = 23; i >= -1; i--) {
            if(i==23){
                Log.d("i:", String.valueOf(i));
                if(SunsetTime_MINUTES_1>=45){
                    SunsetTime_MINUTES_1=SunsetTime_MINUTES_1-45;
                    createAlarm(alarmTitleArray[4]+alarmTitleArray[5], SunsetTime_HOURS_1 ,SunsetTime_MINUTES_1 );
                    Log.d("SunsetTime_HOURS_1:", String.valueOf(SunsetTime_HOURS_1));
                    Log.d("SunsetTime_MINUTES_1:", String.valueOf(SunsetTime_MINUTES_1));
                }
                else{
                    SunsetTime_HOURS_1=SunsetTime_HOURS_1-1;
                    SunsetTime_MINUTES_1=SunsetTime_MINUTES_1+15;
                    createAlarm(alarmTitleArray[4]+alarmTitleArray[5], SunsetTime_HOURS_1 ,SunsetTime_MINUTES_1 );
                    Log.d("SunsetTime_HOURS_1:", String.valueOf(SunsetTime_HOURS_1));
                    Log.d("SunsetTime_MINUTES_1:", String.valueOf(SunsetTime_MINUTES_1));
                }
            }
            else{
                if(i==11){
                    Log.d("i11:", String.valueOf(i));
                    if(SunsetTime_MINUTES_1>=30){
                        SunsetTime_HOURS_1=SunsetTime_HOURS_1-1;
                        SunsetTime_MINUTES_1=SunsetTime_MINUTES_1-30;
                        createAlarm(alarmTitleArray[0]+alarmTitleArray[15]+alarmTitleArray[1]+alarmTitleArray[2]+alarmTitleArray[3]+alarmTitleArray[2]+alarmTitleArray[5], SunsetTime_HOURS_1 ,SunsetTime_MINUTES_1 );
                        Log.d("SunsetTime_HOURS_1:", String.valueOf(SunsetTime_HOURS_1));
                        Log.d("SunsetTime_MINUTES_1:", String.valueOf(SunsetTime_MINUTES_1));

                    }
                    else{
                        SunsetTime_HOURS_1=SunsetTime_HOURS_1-2;
                        SunsetTime_MINUTES_1=SunsetTime_MINUTES_1+30;
                        createAlarm(alarmTitleArray[0]+alarmTitleArray[15]+alarmTitleArray[1]+alarmTitleArray[2]+alarmTitleArray[3]+alarmTitleArray[2]+alarmTitleArray[5], SunsetTime_HOURS_1 ,SunsetTime_MINUTES_1 );
                        Log.d("SunsetTime_HOURS_1:", String.valueOf(SunsetTime_HOURS_1));
                        Log.d("SunsetTime_MINUTES_1:", String.valueOf(SunsetTime_MINUTES_1));
                    }
                }
                else{
                    if(i==-1){
                        Log.d("i:", String.valueOf(i));
                        SunsetTime_HOURS_1=SunsetTime_HOURS_1-1;
                        createAlarm(alarmTitleArray[6]+alarmTitleArray[9], SunsetTime_HOURS_1 ,SunsetTime_MINUTES_1 );
                        Log.d("SunsetTime_HOURS_1:", String.valueOf(SunsetTime_HOURS_1));
                        Log.d("SunsetTime_MINUTES_1:", String.valueOf(SunsetTime_MINUTES_1));
                        Toast.makeText(this,"CreateAlarm Completed.", Toast.LENGTH_SHORT).show();
                    }
                    else{

                        if(i%2==0){
                            Log.d("i:", String.valueOf(i));
                            if(SunsetTime_MINUTES_1>=40){
                                SunsetTime_MINUTES_1=SunsetTime_MINUTES_1-40;
                                createAlarm(alarmTitleArray[0]+alarmTitleArray[i/2+10]+alarmTitleArray[1]+alarmTitleArray[2], SunsetTime_HOURS_1 ,SunsetTime_MINUTES_1 );
                                Log.d("SunsetTime_HOURS_1:", String.valueOf(SunsetTime_HOURS_1));
                                Log.d("SunsetTime_MINUTES_1:", String.valueOf(SunsetTime_MINUTES_1));
                            }
                            else{
                                SunsetTime_HOURS_1=SunsetTime_HOURS_1-1;
                                SunsetTime_MINUTES_1=SunsetTime_MINUTES_1+20;
                                createAlarm(alarmTitleArray[0]+alarmTitleArray[i/2+10]+alarmTitleArray[1]+alarmTitleArray[2], SunsetTime_HOURS_1 ,SunsetTime_MINUTES_1 );
                                Log.d("SunsetTime_HOURS_1:", String.valueOf(SunsetTime_HOURS_1));
                                Log.d("SunsetTime_MINUTES_1:", String.valueOf(SunsetTime_MINUTES_1));
                            }
                        }
                        else{
                            Log.d("i:", String.valueOf(i));
                            if(SunsetTime_MINUTES_1>=10){
                                SunsetTime_MINUTES_1=SunsetTime_MINUTES_1-10;
                                createAlarm(alarmTitleArray[0]+alarmTitleArray[(i+1)/2+9]+alarmTitleArray[1]+alarmTitleArray[2]+alarmTitleArray[3]+alarmTitleArray[2]+alarmTitleArray[5], SunsetTime_HOURS_1 ,SunsetTime_MINUTES_1 );
                                Log.d("SunsetTime_HOURS_1:", String.valueOf(SunsetTime_HOURS_1));
                                Log.d("SunsetTime_MINUTES_1:", String.valueOf(SunsetTime_MINUTES_1));
                            }
                            else{
                                SunsetTime_HOURS_1=SunsetTime_HOURS_1-1;
                                SunsetTime_MINUTES_1=SunsetTime_MINUTES_1+50;
                                createAlarm(alarmTitleArray[0]+alarmTitleArray[(i+1)/2+9]+alarmTitleArray[1]+alarmTitleArray[2]+alarmTitleArray[3]+alarmTitleArray[2]+alarmTitleArray[5], SunsetTime_HOURS_1 ,SunsetTime_MINUTES_1 );
                                Log.d("SunsetTime_HOURS_1:", String.valueOf(SunsetTime_HOURS_1));
                                Log.d("SunsetTime_MINUTES_1:", String.valueOf(SunsetTime_MINUTES_1));
                            }
                        }

                    }
                }

            }

        }

    }
    public void sendMessage(View view) throws IOException, InterruptedException, SAXException {
        //computeTime(getSunsetTime()[0],getSunsetTime()[1]);
        //createAlarm("title",getSunsetTime()[0],getSunsetTime()[1]);

        HtmlParser htmlParser=new HtmlParser(getApplicationContext());
    }

    @Override
    public DocumentType getDoctype() {
        return null;
    }

    @Override
    public DOMImplementation getImplementation() {
        return null;
    }

    @Override
    public Element getDocumentElement() {
        return null;
    }

    @Override
    public Element createElement(String s) throws DOMException {
        return null;
    }

    @Override
    public DocumentFragment createDocumentFragment() {
        return null;
    }

    @Override
    public Text createTextNode(String s) {
        return null;
    }

    @Override
    public Comment createComment(String s) {
        return null;
    }

    @Override
    public CDATASection createCDATASection(String s) throws DOMException {
        return null;
    }

    @Override
    public ProcessingInstruction createProcessingInstruction(String s, String s1) throws DOMException {
        return null;
    }

    @Override
    public Attr createAttribute(String s) throws DOMException {
        return null;
    }

    @Override
    public EntityReference createEntityReference(String s) throws DOMException {
        return null;
    }

    @Override
    public NodeList getElementsByTagName(String s) {
        return null;
    }

    @Override
    public Node importNode(Node node, boolean b) throws DOMException {
        return null;
    }

    @Override
    public Element createElementNS(String s, String s1) throws DOMException {
        return null;
    }

    @Override
    public Attr createAttributeNS(String s, String s1) throws DOMException {
        return null;
    }

    @Override
    public NodeList getElementsByTagNameNS(String s, String s1) {
        return null;
    }

    @Override
    public Element getElementById(String s) {
        return null;
    }

    @Override
    public String getInputEncoding() {
        return null;
    }

    @Override
    public String getXmlEncoding() {
        return null;
    }

    @Override
    public boolean getXmlStandalone() {
        return false;
    }

    @Override
    public void setXmlStandalone(boolean b) throws DOMException {

    }

    @Override
    public String getXmlVersion() {
        return null;
    }

    @Override
    public void setXmlVersion(String s) throws DOMException {

    }

    @Override
    public boolean getStrictErrorChecking() {
        return false;
    }

    @Override
    public void setStrictErrorChecking(boolean b) {

    }

    @Override
    public String getDocumentURI() {
        return null;
    }

    @Override
    public void setDocumentURI(String s) {

    }

    @Override
    public Node adoptNode(Node node) throws DOMException {
        return null;
    }

    @Override
    public DOMConfiguration getDomConfig() {
        return null;
    }

    @Override
    public void normalizeDocument() {

    }

    @Override
    public Node renameNode(Node node, String s, String s1) throws DOMException {
        return null;
    }

    @Override
    public String getNodeName() {
        return null;
    }

    @Override
    public String getNodeValue() throws DOMException {
        return null;
    }

    @Override
    public void setNodeValue(String s) throws DOMException {

    }

    @Override
    public short getNodeType() {
        return 0;
    }

    @Override
    public Node getParentNode() {
        return null;
    }

    @Override
    public NodeList getChildNodes() {
        return null;
    }

    @Override
    public Node getFirstChild() {
        return null;
    }

    @Override
    public Node getLastChild() {
        return null;
    }

    @Override
    public Node getPreviousSibling() {
        return null;
    }

    @Override
    public Node getNextSibling() {
        return null;
    }

    @Override
    public NamedNodeMap getAttributes() {
        return null;
    }

    @Override
    public Document getOwnerDocument() {
        return null;
    }

    @Override
    public Node insertBefore(Node node, Node node1) throws DOMException {
        return null;
    }

    @Override
    public Node replaceChild(Node node, Node node1) throws DOMException {
        return null;
    }

    @Override
    public Node removeChild(Node node) throws DOMException {
        return null;
    }

    @Override
    public Node appendChild(Node node) throws DOMException {
        return null;
    }

    @Override
    public boolean hasChildNodes() {
        return false;
    }

    @Override
    public Node cloneNode(boolean b) {
        return null;
    }

    @Override
    public void normalize() {

    }

    @Override
    public boolean isSupported(String s, String s1) {
        return false;
    }

    @Override
    public String getNamespaceURI() {
        return null;
    }

    @Override
    public String getPrefix() {
        return null;
    }

    @Override
    public void setPrefix(String s) throws DOMException {

    }

    @Override
    public String getLocalName() {
        return null;
    }

    @Override
    public boolean hasAttributes() {
        return false;
    }

    @Override
    public String getBaseURI() {
        return null;
    }

    @Override
    public short compareDocumentPosition(Node node) throws DOMException {
        return 0;
    }

    @Override
    public String getTextContent() throws DOMException {
        return null;
    }

    @Override
    public void setTextContent(String s) throws DOMException {

    }

    @Override
    public boolean isSameNode(Node node) {
        return false;
    }

    @Override
    public String lookupPrefix(String s) {
        return null;
    }

    @Override
    public boolean isDefaultNamespace(String s) {
        return false;
    }

    @Override
    public String lookupNamespaceURI(String s) {
        return null;
    }

    @Override
    public boolean isEqualNode(Node node) {
        return false;
    }

    @Override
    public Object getFeature(String s, String s1) {
        return null;
    }

    @Override
    public Object setUserData(String s, Object o, UserDataHandler userDataHandler) {
        return null;
    }

    @Override
    public Object getUserData(String s) {
        return null;
    }
}