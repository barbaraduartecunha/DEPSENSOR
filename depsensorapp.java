package com.google.appinventor.common.version;
public final class AppInventorFeatures
{
  public static boolean hasDebuggingView() { return true; }
  public static boolean hasYailGenerationOption() { return true; }
  public static boolean sendBugReports() { return true; }
public static boolean allowMultiScreenApplications() { return true; }
  public static boolean showInternalComponentsCategory() { return false; }
 public static boolean takeScreenShots() { return false; }
  public static boolean trackClientEvents() { return false; }
 public static boolean showSplashScreen() { return true; }
 public static boolean showSurveySplashScreen() { return false; }
public static boolean requireOneLogin() { return false; }
}

package com.google.appinventor.common.version;
public final class GitBuildId
{
  public static final String GIT_BUILD_VERSION = "nls-1156-gd341c57-dirty";
  public static final String GIT_BUILD_FINGERPRINT = "d341c5784d6162deee176b06d683c1fee804fec4";
  public static final String ANT_BUILD_DATE = "February 21 2017";
  public static final String ACRA_URI = "${acra.uri}";
  
  public static String getVersion() {
    version = "nls-1156-gd341c57-dirty";
    if (version == "" || version.contains(" ")) {
      return "none";
    }
    return version;
  }
  public static String getFingerprint() { return "d341c5784d6162deee176b06d683c1fee804fec4"; }
  public static String getDate() { return "February 21 2017"; }
  public static String getAcraUri() {
    if ("${acra.uri}".equals("${acra.uri}"))
      return ""; 
    return "${acra.uri}".trim();
  }
}
package com.google.appinventor.components.annotations;

import com.google.appinventor.components.common.ComponentCategory;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.TYPE})
public @interface DesignerComponent {
  ComponentCategory category() default ComponentCategory.UNINITIALIZED;
  
  String description() default "";
  
  String designerHelpDescription() default "";
  
  boolean showOnPalette() default true;
  
  boolean nonVisible() default false;
  
  String iconName() default "";
  
  int version();
}
package com.google.appinventor.components.annotations;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.METHOD})
public @interface DesignerProperty {
  String editorType() default "text";
  
  String defaultValue() default "";
}
package com.google.appinventor.components.annotations
public static enum PropertyCategory
{
  BEHAVIOR("Behavior"),
  APPEARANCE("Appearance"),
  DEPRECATED("Deprecated"),
  UNSET("Unspecified");
  
  private String name;

  
  PropertyCategory(String categoryName) { this.name = categoryName; }


  
  public String getName() { return this.name; }
}

<?xml version="1.0" encoding="utf-8"?>

<manifest xmlns:android="http://schemas.android.com/apk/res/android"

    package="org.appinventor"

    android:versionCode="1"

    android:versionName="1.0" >

<uses-sdk

        android:minSdkVersion="8"

        android:targetSdkVersion="21" />

    



<application

        android:allowBackup="true"

        android:icon="@drawable/ic_launcher"

        android:label="Acupultura">

        <activity

            android:name=".Acupultura"

            android:label="Acupultura" >

            <intent-filter>

                <action android:name="android.intent.action.MAIN" />



                <category android:name="android.intent.category.LAUNCHER" />

            </intent-filter>

        

</activity>

        <activity android:name="Alimentcao" ></activity>
<activity android:name="Comoperceberossintomas" ></activity>
<activity android:name="Depressaoadolecentes" ></activity>
<activity android:name="Depressaoemidosos" ></activity>
<activity android:name="Depressaoecomorbidade" ></activity>
<activity android:name="Homeopatia" ></activity>
<activity android:name="Meditacao" ></activity>
<activity android:name="Psicoterapia" ></activity>
<activity android:name="Reiki" ></activity>
<activity android:name="Screen1" ></activity>
<activity android:name="Screen2" ></activity>
<activity android:name="Screen3" ></activity>
<activity android:name="Screen4" ></activity>
<activity android:name="Sintomas" ></activity>
<activity android:name="Terapiascomplemetares" ></activity>
<activity android:name="Transtornodepressivomaior" ></activity>
<activity android:name="Transtornodepressivopersistente" ></activity>
<activity android:name="classederemedios" ></activity>
<activity android:name="classificacao" ></activity>
<activity android:name="comoajudaralguemcomdepressao" ></activity>
<activity android:name="comolidar" ></activity>
<activity android:name="depeidade" ></activity>
<activity android:name="depressaoecancer" ></activity>
<activity android:name="depressaoehiv" ></activity>
<activity android:name="depressaoeidade" ></activity>
<activity android:name="depressaoeobesidade" ></activity>
<activity android:name="depressaoesuicidio" ></activity>
<activity android:name="depressaoeoutrostranstornospsico" ></activity>
<activity android:name="exercicios" ></activity>
<activity android:name="depressaoeidadecerta" ></activity>
<activity android:name="oqueedep" ></activity>
<activity android:name="fitoterapia" ></activity>
<activity android:name="terapiamedicamentosa" ></activity>
<activity android:name="vermais" ></activity>
<activity android:name="tratamento" ></activity>
<activity android:name="yoga" ></activity>
</application>



</manifest>

package org.appinventor;
import com.google.appinventor.components.runtime.HandlesEventDispatching;
import com.google.appinventor.components.runtime.EventDispatcher;
import com.google.appinventor.components.runtime.Form;
import com.google.appinventor.components.runtime.Component;
import com.google.appinventor.components.runtime.Button;
import com.google.appinventor.components.runtime.HorizontalArrangement;
import com.google.appinventor.components.runtime.Label;
import com.google.appinventor.components.runtime.VerticalArrangement;
class Acupultura extends Form implements HandlesEventDispatching {
  private Button Button1;
  private HorizontalArrangement HorizontalArrangement1;
  private HorizontalArrangement HorizontalArrangement2;
  private Label Label1;
  private VerticalArrangement VerticalArrangement1;
  private Label Label2;
  protected void $define() {
    this.AppName("HourOfCode");
    this.Title("Acupultura");
    Button1 = new Button(this);
    Button1.BackgroundColor(0xEF5D79DE);
    Button1.Text("Voltar");
    Button1.TextColor(0xFFFFFFFF);
    HorizontalArrangement1 = new HorizontalArrangement(this);
    HorizontalArrangement1.Height(-1002);
    HorizontalArrangement2 = new HorizontalArrangement(this);
    HorizontalArrangement2.AlignHorizontal(3);
    HorizontalArrangement2.AlignVertical(2);
    HorizontalArrangement2.BackgroundColor(0xEF5D79DE);
    HorizontalArrangement2.Height(-1010);
    HorizontalArrangement2.Width(LENGTH_FILL_PARENT);
    Label1 = new Label(HorizontalArrangement2);
    Label1.FontBold(true);
    Label1.FontSize(20);
    Label1.Text("Acupuntura");
    Label1.TextColor(0xFFFFFFFF);
    VerticalArrangement1 = new VerticalArrangement(this);
    VerticalArrangement1.AlignHorizontal(3);
    VerticalArrangement1.AlignVertical(2);
    VerticalArrangement1.BackgroundColor(0xFFCCCCCC);
    VerticalArrangement1.Height(-1030);
    VerticalArrangement1.Width(LENGTH_FILL_PARENT);
    Label2 = new Label(VerticalArrangement1);
    Label2.FontBold(true);
    Label2.FontSize(17);
    Label2.Height(LENGTH_FILL_PARENT);
    Label2.Width(LENGTH_FILL_PARENT);
    Label2.Text("Tratamento originado na medicina chinesa baseado na inser����o de agulhas finas na pele, em determinados locais do corpo, que proporcionam uma sensa����o de bem-estar.  ");
  }
  public boolean dispatchEvent(Component component, String componentName, String eventName, Object[] params){
    return false;
  }
}
package org.appinventor;
import com.google.appinventor.components.runtime.HandlesEventDispatching;
import com.google.appinventor.components.runtime.EventDispatcher;
import com.google.appinventor.components.runtime.Form;
import com.google.appinventor.components.runtime.Component;
import com.google.appinventor.components.runtime.Button;
import com.google.appinventor.components.runtime.HorizontalArrangement;
import com.google.appinventor.components.runtime.Label;
import com.google.appinventor.components.runtime.VerticalArrangement;
class Alimentcao extends Form implements HandlesEventDispatching {
  private Button Button1;
  private HorizontalArrangement HorizontalArrangement1;
  private HorizontalArrangement HorizontalArrangement2;
  private Label Label1;
  private VerticalArrangement VerticalArrangement1;
  private Label Label2;
  private Label Label3;
  private Label Label4;
  private Label Label7;
  private Label Label5;
  private Label Label6;
  protected void $define() {
    this.AppName("HourOfCode");
    this.Title("Alimentcao");
    Button1 = new Button(this);
    Button1.BackgroundColor(0xEF5D79DE);
    Button1.Text("Voltar");
    Button1.TextColor(0xFFFFFFFF);
    HorizontalArrangement1 = new HorizontalArrangement(this);
    HorizontalArrangement1.Height(-1002);
    HorizontalArrangement2 = new HorizontalArrangement(this);
    HorizontalArrangement2.AlignHorizontal(3);
    HorizontalArrangement2.AlignVertical(2);
    HorizontalArrangement2.BackgroundColor(0xEF5D79DE);
    HorizontalArrangement2.Height(-1010);
    HorizontalArrangement2.Width(LENGTH_FILL_PARENT);
    Label1 = new Label(HorizontalArrangement2);
    Label1.FontBold(true);
    Label1.FontSize(20);
    Label1.Text("Alimenta����o");
    Label1.TextColor(0xFFFFFFFF);
    VerticalArrangement1 = new VerticalArrangement(this);
    VerticalArrangement1.AlignHorizontal(3);
    VerticalArrangement1.AlignVertical(2);
    VerticalArrangement1.BackgroundColor(0xFFCCCCCC);
    VerticalArrangement1.Height(-1040);
    VerticalArrangement1.Width(LENGTH_FILL_PARENT);
    Label2 = new Label(VerticalArrangement1);
    Label2.FontBold(true);
    Label2.Height(-1010);
    Label2.Width(LENGTH_FILL_PARENT);
    Label2.Text("A ingest��o de certos tipos de alimentos podem ajudar na produ����o de serotonina (o horm��nio do bem-estar), tais  como:");
    Label3 = new Label(VerticalArrangement1);
    Label3.FontBold(true);
    Label3.Text(" Frutas;");
    Label4 = new Label(VerticalArrangement1);
    Label4.FontBold(true);
    Label4.Text("Nozes;");
    Label7 = new Label(VerticalArrangement1);
    Label7.FontBold(true);
    Label7.Text("Latic��nios;");
    Label5 = new Label(VerticalArrangement1);
    Label5.FontBold(true);
    Label5.Text("Carnes magras;");
    Label6 = new Label(VerticalArrangement1);
    Label6.FontBold(true);
    Label6.Text("Carboidratos complexos. ");
  }
  public boolean dispatchEvent(Component component, String componentName, String eventName, Object[] params){
    return false;
  }
}
package org.appinventor;
import com.google.appinventor.components.runtime.HandlesEventDispatching;
import com.google.appinventor.components.runtime.EventDispatcher;
import com.google.appinventor.components.runtime.Form;
import com.google.appinventor.components.runtime.Component;
import com.google.appinventor.components.runtime.Button;
import com.google.appinventor.components.runtime.HorizontalArrangement;
import com.google.appinventor.components.runtime.Label;
class Comoperceberossintomas extends Form implements HandlesEventDispatching {
  private Button Button1;
  private HorizontalArrangement HorizontalArrangement4;
  private HorizontalArrangement HorizontalArrangement2;
  private Label Label2;
  private HorizontalArrangement HorizontalArrangement3;
  private HorizontalArrangement HorizontalArrangement1;
  private Label Label1;
  protected void $define() {
    this.AppName("HourOfCode");
    this.Title("Comoperceberossintomas");
    Button1 = new Button(this);
    Button1.BackgroundColor(0xEF5D79DE);
    Button1.Text("Voltar");
    Button1.TextColor(0xFFFFFFFF);
    HorizontalArrangement4 = new HorizontalArrangement(this);
    HorizontalArrangement4.Height(-1002);
    HorizontalArrangement4.Width(LENGTH_FILL_PARENT);
    HorizontalArrangement2 = new HorizontalArrangement(this);
    HorizontalArrangement2.Width(LENGTH_FILL_PARENT);
    Label2 = new Label(HorizontalArrangement2);
    Label2.BackgroundColor(0xEF5D79DE);
    Label2.FontBold(true);
    Label2.FontSize(20);
    Label2.Height(LENGTH_FILL_PARENT);
    Label2.Width(LENGTH_FILL_PARENT);
    Label2.Text("Como perceber os sintomas?");
    Label2.TextColor(0xFFFFFFFF);
    HorizontalArrangement3 = new HorizontalArrangement(this);
    HorizontalArrangement3.Height(-1002);
    HorizontalArrangement3.Width(LENGTH_FILL_PARENT);
    HorizontalArrangement1 = new HorizontalArrangement(this);
    HorizontalArrangement1.BackgroundColor(0xFFCCCCCC);
    HorizontalArrangement1.Height(-1060);
    HorizontalArrangement1.Width(LENGTH_FILL_PARENT);
    Label1 = new Label(HorizontalArrangement1);
    Label1.FontBold(true);
    Label1.FontSize(17);
    Label1.Height(-1060);
    Label1.Width(LENGTH_FILL_PARENT);
    Label1.Text("Os sintomas surgem devagar durante dias ou semanas e variam muito de acordo com a pessoa. Existem casos onde as pessoas n��o demonstram sinais de tristeza ou apatia, como de costume, ao inv��s disso, expressam rea����es de alegria, aparentando umaa falsa normalidade. Nos casos onde os sinais de tristeza e desinteresse do indiv��duo s��o evidentes, percebe-se uma pessoa ap��tica, desanimada e reclusa. Esses s��o os sintomas mais comuns em em pessoas deprimidas, contudo existe outros que podem surgir, como visto na ��rea Sintomas do aplicativo.");
  }
  public boolean dispatchEvent(Component component, String componentName, String eventName, Object[] params){
    return false;
  }
}
package org.appinventor;
import com.google.appinventor.components.runtime.HandlesEventDispatching;
import com.google.appinventor.components.runtime.EventDispatcher;
import com.google.appinventor.components.runtime.Form;
import com.google.appinventor.components.runtime.Component;
import com.google.appinventor.components.runtime.Button;
import com.google.appinventor.components.runtime.HorizontalArrangement;
import com.google.appinventor.components.runtime.Label;
import com.google.appinventor.components.runtime.VerticalArrangement;
class Depressaoadolecentes extends Form implements HandlesEventDispatching {
  private Button Button1;
  private HorizontalArrangement HorizontalArrangement1;
  private HorizontalArrangement HorizontalArrangement2;
  private Label Label1;
  private VerticalArrangement VerticalArrangement1;
  private Label Label2;
  private Label Label3;
  private Label Label4;
  private Label Label5;
  private Label Label6;
  private Label Label7;
  protected void $define() {
    this.AppName("HourOfCode");
    this.Title("Depressaoadolecentes");
    Button1 = new Button(this);
    Button1.BackgroundColor(0xEF5D79DE);
    Button1.Text("Voltar");
    Button1.TextColor(0xFFFFFFFF);
    HorizontalArrangement1 = new HorizontalArrangement(this);
    HorizontalArrangement1.Height(-1002);
    HorizontalArrangement2 = new HorizontalArrangement(this);
    HorizontalArrangement2.AlignHorizontal(3);
    HorizontalArrangement2.AlignVertical(2);
    HorizontalArrangement2.BackgroundColor(0xEF5D79DE);
    HorizontalArrangement2.Height(-1010);
    HorizontalArrangement2.Width(LENGTH_FILL_PARENT);
    Label1 = new Label(HorizontalArrangement2);
    Label1.FontBold(true);
    Label1.FontSize(20);
    Label1.Text("Depress��o em Adolescentes");
    Label1.TextColor(0xFFFFFFFF);
    VerticalArrangement1 = new VerticalArrangement(this);
    VerticalArrangement1.AlignHorizontal(3);
    VerticalArrangement1.AlignVertical(2);
    VerticalArrangement1.BackgroundColor(0xFFCCCCCC);
    VerticalArrangement1.Height(LENGTH_FILL_PARENT);
    VerticalArrangement1.Width(LENGTH_FILL_PARENT);
    Label2 = new Label(VerticalArrangement1);
    Label2.FontBold(true);
    Label2.FontSize(17);
    Label2.Height(LENGTH_FILL_PARENT);
    Label2.Width(LENGTH_FILL_PARENT);
    Label2.Text("A depress��o em adolescentes, apresentam sintomas parecidos aos dos adultos,sendo rorrentes nos jovens sintomas como irritabilidade e instabilidade emocional, ocorrendo crises de explos��o de raiva, al��m da fadiga, apatia, desinteresse, dificuldade de se concentrar, sentir muito sono,  altera����o de apetite e de peso, baixa autoestima, ideias e tentativas de suic��dios e comportamento autodestrutivo.");
    Label3 = new Label(VerticalArrangement1);
    Label3.FontBold(true);
    Label3.FontSize(15);
    Label3.Text("Principais causas");
    Label4 = new Label(VerticalArrangement1);
    Label4.FontBold(true);
    Label4.FontSize(14);
    Label4.Text("Fator heredit��rio;");
    Label5 = new Label(VerticalArrangement1);
    Label5.FontBold(true);
    Label5.Text("Estresse ambiental; ");
    Label6 = new Label(VerticalArrangement1);
    Label6.FontBold(true);
    Label6.Text("Abusos f��sicos, sexuais e/ou psicol��gicos;");
    Label7 = new Label(VerticalArrangement1);
    Label7.Text("Perda de um ente querido.");
  }
  public boolean dispatchEvent(Component component, String componentName, String eventName, Object[] params){
    return false;
  }
}
package org.appinventor;
import com.google.appinventor.components.runtime.HandlesEventDispatching;
import com.google.appinventor.components.runtime.EventDispatcher;
import com.google.appinventor.components.runtime.Form;
import com.google.appinventor.components.runtime.Component;
import com.google.appinventor.components.runtime.Button;
import com.google.appinventor.components.runtime.HorizontalArrangement;
import com.google.appinventor.components.runtime.Label;
import com.google.appinventor.components.runtime.VerticalArrangement;
class Depressaoecomorbidade extends Form implements HandlesEventDispatching {
  private Button Button1;
  private HorizontalArrangement HorizontalArrangement1;
  private HorizontalArrangement HorizontalArrangement2;
  private Label Label1;
  private VerticalArrangement VerticalArrangement1;
  private Label Label2;
  private Button Button2;
  protected void $define() {
    this.AppName("HourOfCode");
    this.Title("Depressaoecomorbidade");
    Button1 = new Button(this);
    Button1.BackgroundColor(0xEF5D79DE);
    Button1.Text("Voltar");
    Button1.TextColor(0xFFFFFFFF);
    HorizontalArrangement1 = new HorizontalArrangement(this);
    HorizontalArrangement1.Height(-1002);
    HorizontalArrangement2 = new HorizontalArrangement(this);
    HorizontalArrangement2.AlignHorizontal(3);
    HorizontalArrangement2.AlignVertical(2);
    HorizontalArrangement2.BackgroundColor(0xEF5D79DE);
    HorizontalArrangement2.Height(-1010);
    HorizontalArrangement2.Width(LENGTH_FILL_PARENT);
    Label1 = new Label(HorizontalArrangement2);
    Label1.FontSize(20);
    Label1.Text("Depress��o e Comobidade");
    Label1.TextColor(0xFFFFFFFF);
    VerticalArrangement1 = new VerticalArrangement(this);
    VerticalArrangement1.AlignHorizontal(3);
    VerticalArrangement1.AlignVertical(2);
    VerticalArrangement1.BackgroundColor(0xFFCCCCCC);
    VerticalArrangement1.Height(LENGTH_FILL_PARENT);
    VerticalArrangement1.Width(LENGTH_FILL_PARENT);
    Label2 = new Label(VerticalArrangement1);
    Label2.FontBold(true);
    Label2.FontSize(17);
    Label2.Height(LENGTH_FILL_PARENT);
    Label2.Width(LENGTH_FILL_PARENT);
    Label2.Text("A depress��o pode agravar outros fatores relacionados �� sa��de do paciente de maneira que, as pessoas com doen��as clinicas e depress��o, apresentam maior risco de n��o seguirem as recomenda����es m��dicas. Al��m de aumentar a taxa de mortalidade, como por exemplo, nos pacientes card��acos, a mortalidade aumenta 3,1x nos pacientes depressivos em rela����o aos n��o depressivos. Portanto, a depress��o pode agravar outra doen��a que o paciente tiver, por meio do aumento da percep����o dos sintomas ou por n��o seguir as recomenda����es m��dicas.");
    Button2 = new Button(VerticalArrangement1);
    Button2.BackgroundColor(0xEF5D79DE);
    Button2.Text("Ver mais");
    Button2.TextColor(0xFFFFFFFF);
  }
  public boolean dispatchEvent(Component component, String componentName, String eventName, Object[] params){
    return false;
  }
}
package org.appinventor;
import com.google.appinventor.components.runtime.HandlesEventDispatching;
import com.google.appinventor.components.runtime.EventDispatcher;
import com.google.appinventor.components.runtime.Form;
import com.google.appinventor.components.runtime.Component;
import com.google.appinventor.components.runtime.Button;
import com.google.appinventor.components.runtime.HorizontalArrangement;
import com.google.appinventor.components.runtime.Label;
import com.google.appinventor.components.runtime.VerticalArrangement;
class Depressaoemidosos extends Form implements HandlesEventDispatching {
  private Button Button1;
  private HorizontalArrangement HorizontalArrangement1;
  private HorizontalArrangement HorizontalArrangement2;
  private Label Label1;
  private VerticalArrangement VerticalArrangement1;
  private Label Label2;
  protected void $define() {
    this.AppName("HourOfCode");
    this.Title("Depressaoemidosos");
    Button1 = new Button(this);
    Button1.BackgroundColor(0xEF5D79DE);
    Button1.Text("Voltar");
    Button1.TextColor(0xFFFFFFFF);
    HorizontalArrangement1 = new HorizontalArrangement(this);
    HorizontalArrangement1.Height(-1002);
    HorizontalArrangement2 = new HorizontalArrangement(this);
    HorizontalArrangement2.AlignHorizontal(3);
    HorizontalArrangement2.AlignVertical(2);
    HorizontalArrangement2.BackgroundColor(0xEF5D79DE);
    HorizontalArrangement2.Height(-1010);
    HorizontalArrangement2.Width(LENGTH_FILL_PARENT);
    Label1 = new Label(HorizontalArrangement2);
    Label1.FontBold(true);
    Label1.FontSize(20);
    Label1.Text("Depress��o em Idosos");
    Label1.TextColor(0xFFFFFFFF);
    VerticalArrangement1 = new VerticalArrangement(this);
    VerticalArrangement1.AlignHorizontal(3);
    VerticalArrangement1.AlignVertical(2);
    VerticalArrangement1.BackgroundColor(0xFFCCCCCC);
    VerticalArrangement1.Height(LENGTH_FILL_PARENT);
    VerticalArrangement1.Width(LENGTH_FILL_PARENT);
    Label2 = new Label(VerticalArrangement1);
    Label2.FontBold(true);
    Label2.FontSize(17);
    Label2.Height(LENGTH_FILL_PARENT);
    Label2.Width(LENGTH_FILL_PARENT);
    Label2.Text("Cerca de uma a cada seis pessoas idosas s��o afetadas pela depress��o, existindo uma  dificuldade de diagnosticar a depress��o em raz��o de seus sintomas serem menos percept��veis, devido �� redu����o de intera����o social ocasionada pela falta de trabalho. Os sintomas podem ser confundidos a outros transtornos, como a dem��ncia, e alguns familiares podem acreditar que os sintomas fazem parte do processo de envelhecimento, considerando-os normais. Assim �� importante que os familiares fiquem atentos a mudan��as de personalidades, sobretudo no des��nimo, perda do senso de humor e nas falhas de mem��ria.");
  }
  public boolean dispatchEvent(Component component, String componentName, String eventName, Object[] params){
    return false;
  }
}
package org.appinventor;
import com.google.appinventor.components.runtime.HandlesEventDispatching;
import com.google.appinventor.components.runtime.EventDispatcher;
import com.google.appinventor.components.runtime.Form;
import com.google.appinventor.components.runtime.Component;
import com.google.appinventor.components.runtime.Button;
import com.google.appinventor.components.runtime.HorizontalArrangement;
import com.google.appinventor.components.runtime.VerticalScrollArrangement;
import com.google.appinventor.components.runtime.Label;
class Homeopatia extends Form implements HandlesEventDispatching {
  private Button Button1;
  private HorizontalArrangement HorizontalArrangement1;
  private VerticalScrollArrangement VerticalScrollArrangement1;
  private Label Label1;
  private VerticalScrollArrangement VerticalScrollArrangement2;
  private Label Label2;
  protected void $define() {
    this.AppName("HourOfCode");
    this.Title("Homeopatia");
    Button1 = new Button(this);
    Button1.BackgroundColor(0xEF5D79DE);
    Button1.Text("Voltar");
    Button1.TextColor(0xFFFFFFFF);
    HorizontalArrangement1 = new HorizontalArrangement(this);
    HorizontalArrangement1.Height(-1002);
    VerticalScrollArrangement1 = new VerticalScrollArrangement(this);
    VerticalScrollArrangement1.AlignHorizontal(3);
    VerticalScrollArrangement1.BackgroundColor(0xEF5D79DE);
    VerticalScrollArrangement1.Height(-1010);
    VerticalScrollArrangement1.Width(LENGTH_FILL_PARENT);
    Label1 = new Label(VerticalScrollArrangement1);
    Label1.FontBold(true);
    Label1.FontSize(20);
    Label1.Text("Homeopatia");
    Label1.TextColor(0xFFFFFFFF);
    VerticalScrollArrangement2 = new VerticalScrollArrangement(this);
    VerticalScrollArrangement2.BackgroundColor(0xFFCCCCCC);
    VerticalScrollArrangement2.Height(-1020);
    VerticalScrollArrangement2.Width(LENGTH_FILL_PARENT);
    Label2 = new Label(VerticalScrollArrangement2);
    Label2.FontBold(true);
    Label2.FontSize(17);
    Label2.Height(LENGTH_FILL_PARENT);
    Label2.Width(LENGTH_FILL_PARENT);
    Label2.Text("Os medicamentos homeop��ticos s��o subst��ncias vegetais, animais ou minerais  dilu��das em ��gua na escala de 1 para 100x.");
  }
  public boolean dispatchEvent(Component component, String componentName, String eventName, Object[] params){
    return false;
  }
}
package org.appinventor;
import com.google.appinventor.components.runtime.HandlesEventDispatching;
import com.google.appinventor.components.runtime.EventDispatcher;
import com.google.appinventor.components.runtime.Form;
import com.google.appinventor.components.runtime.Component;
import com.google.appinventor.components.runtime.Button;
import com.google.appinventor.components.runtime.HorizontalArrangement;
import com.google.appinventor.components.runtime.Label;
import com.google.appinventor.components.runtime.VerticalArrangement;
class Meditacao extends Form implements HandlesEventDispatching {
  private Button Button1;
  private HorizontalArrangement HorizontalArrangement1;
  private HorizontalArrangement HorizontalArrangement2;
  private Label Label1;
  private VerticalArrangement VerticalArrangement1;
  private Label Label2;
  protected void $define() {
    this.AppName("HourOfCode");
    this.Title("Meditacao");
    Button1 = new Button(this);
    Button1.BackgroundColor(0xEF5D79DE);
    Button1.Text("Voltar");
    Button1.TextColor(0xFFFFFFFF);
    HorizontalArrangement1 = new HorizontalArrangement(this);
    HorizontalArrangement1.Height(-1002);
    HorizontalArrangement2 = new HorizontalArrangement(this);
    HorizontalArrangement2.AlignHorizontal(3);
    HorizontalArrangement2.AlignVertical(2);
    HorizontalArrangement2.BackgroundColor(0xEF5D79DE);
    HorizontalArrangement2.Height(-1010);
    HorizontalArrangement2.Width(LENGTH_FILL_PARENT);
    Label1 = new Label(HorizontalArrangement2);
    Label1.FontBold(true);
    Label1.FontSize(20);
    Label1.Text("Medita����o");
    Label1.TextColor(0xFFFFFFFF);
    VerticalArrangement1 = new VerticalArrangement(this);
    VerticalArrangement1.AlignHorizontal(3);
    VerticalArrangement1.AlignVertical(2);
    VerticalArrangement1.BackgroundColor(0xFFCCCCCC);
    VerticalArrangement1.Height(-1020);
    VerticalArrangement1.Width(LENGTH_FILL_PARENT);
    Label2 = new Label(VerticalArrangement1);
    Label2.FontBold(true);
    Label2.FontSize(17);
    Label2.Height(LENGTH_FILL_PARENT);
    Label2.Width(LENGTH_FILL_PARENT);
    Label2.Text(" �� um m��todo de relaxamento profundo, por meio de controle da respira����o e da concentra����o.");
  }
  public boolean dispatchEvent(Component component, String componentName, String eventName, Object[] params){
    return false;
  }
}
package org.appinventor;
import com.google.appinventor.components.runtime.HandlesEventDispatching;
import com.google.appinventor.components.runtime.EventDispatcher;
import com.google.appinventor.components.runtime.Form;
import com.google.appinventor.components.runtime.Component;
import com.google.appinventor.components.runtime.Button;
import com.google.appinventor.components.runtime.HorizontalArrangement;
import com.google.appinventor.components.runtime.Label;
class Psicoterapia extends Form implements HandlesEventDispatching {
  private Button Button1;
  private HorizontalArrangement HorizontalArrangement1;
  private HorizontalArrangement HorizontalArrangement2;
  private Label Label1;
  private HorizontalArrangement HorizontalArrangement4;
  private HorizontalArrangement HorizontalArrangement3;
  private Label Label2;
  protected void $define() {
    this.AppName("HourOfCode");
    this.Title("Psicoterapia");
    Button1 = new Button(this);
    Button1.BackgroundColor(0xEF5D79DE);
    Button1.Text("Voltar");
    Button1.TextColor(0xFFFFFFFF);
    HorizontalArrangement1 = new HorizontalArrangement(this);
    HorizontalArrangement1.Height(-1002);
    HorizontalArrangement1.Width(LENGTH_FILL_PARENT);
    HorizontalArrangement2 = new HorizontalArrangement(this);
    HorizontalArrangement2.AlignHorizontal(3);
    HorizontalArrangement2.AlignVertical(2);
    HorizontalArrangement2.BackgroundColor(0xEF5D79DE);
    HorizontalArrangement2.Height(-1010);
    HorizontalArrangement2.Width(LENGTH_FILL_PARENT);
    Label1 = new Label(HorizontalArrangement2);
    Label1.FontBold(true);
    Label1.FontSize(20);
    Label1.Text("Psicoterapia");
    Label1.TextColor(0xFFFFFFFF);
    HorizontalArrangement4 = new HorizontalArrangement(this);
    HorizontalArrangement4.Height(-1005);
    HorizontalArrangement4.Width(LENGTH_FILL_PARENT);
    HorizontalArrangement3 = new HorizontalArrangement(this);
    HorizontalArrangement3.AlignHorizontal(3);
    HorizontalArrangement3.AlignVertical(2);
    HorizontalArrangement3.BackgroundColor(0xFFCCCCCC);
    HorizontalArrangement3.Height(-1030);
    HorizontalArrangement3.Width(LENGTH_FILL_PARENT);
    Label2 = new Label(HorizontalArrangement3);
    Label2.FontBold(true);
    Label2.FontSize(17);
    Label2.Height(LENGTH_FILL_PARENT);
    Label2.Width(LENGTH_FILL_PARENT);
    Label2.Text("A pessoa procura orienta����o de um profissional qualificado, geralmente  um psic��logo ou terapeuta que o ajudar�� a lidar com as situa����es adversas, ouvindo-o e aconselhando-o de maneira segura e confi��vel.");
  }
  public boolean dispatchEvent(Component component, String componentName, String eventName, Object[] params){
    return false;
  }
}
package org.appinventor;
import com.google.appinventor.components.runtime.HandlesEventDispatching;
import com.google.appinventor.components.runtime.EventDispatcher;
import com.google.appinventor.components.runtime.Form;
import com.google.appinventor.components.runtime.Component;
import com.google.appinventor.components.runtime.Button;
import com.google.appinventor.components.runtime.HorizontalArrangement;
import com.google.appinventor.components.runtime.Label;
import com.google.appinventor.components.runtime.VerticalArrangement;
class Reiki extends Form implements HandlesEventDispatching {
  private Button Button1;
  private HorizontalArrangement HorizontalArrangement1;
  private HorizontalArrangement HorizontalArrangement2;
  private Label Label1;
  private VerticalArrangement VerticalArrangement1;
  private Label Label2;
  protected void $define() {
    this.AppName("HourOfCode");
    this.Title("Reiki");
    Button1 = new Button(this);
    Button1.BackgroundColor(0xEF5D79DE);
    Button1.Text("Voltar");
    Button1.TextColor(0xFFFFFFFF);
    HorizontalArrangement1 = new HorizontalArrangement(this);
    HorizontalArrangement1.Height(-1002);
    HorizontalArrangement2 = new HorizontalArrangement(this);
    HorizontalArrangement2.AlignHorizontal(3);
    HorizontalArrangement2.AlignVertical(2);
    HorizontalArrangement2.BackgroundColor(0xEF5D79DE);
    HorizontalArrangement2.Height(-1010);
    HorizontalArrangement2.Width(LENGTH_FILL_PARENT);
    Label1 = new Label(HorizontalArrangement2);
    Label1.FontBold(true);
    Label1.FontSize(20);
    Label1.Text("Reiki");
    Label1.TextColor(0xFFFFFFFF);
    VerticalArrangement1 = new VerticalArrangement(this);
    VerticalArrangement1.BackgroundColor(0xFFCCCCCC);
    VerticalArrangement1.Height(-1015);
    VerticalArrangement1.Width(LENGTH_FILL_PARENT);
    Label2 = new Label(VerticalArrangement1);
    Label2.FontBold(true);
    Label2.FontSize(17);
    Label2.Height(LENGTH_FILL_PARENT);
    Label2.Width(LENGTH_FILL_PARENT);
    Label2.Text(" �� um m��todo de relaxamento profundo, por meio de controle da respira����o e da concentra����o.");
  }
  public boolean dispatchEvent(Component component, String componentName, String eventName, Object[] params){
    return false;
  }
}
package org.appinventor;
import com.google.appinventor.components.runtime.HandlesEventDispatching;
import com.google.appinventor.components.runtime.EventDispatcher;
import com.google.appinventor.components.runtime.Form;
import com.google.appinventor.components.runtime.Component;
import com.google.appinventor.components.runtime.HorizontalArrangement;
import com.google.appinventor.components.runtime.Image;
import com.google.appinventor.components.runtime.Button;
class Screen1 extends Form implements HandlesEventDispatching {
  private HorizontalArrangement HorizontalArrangement1;
  private Image Image2;
  private HorizontalArrangement HorizontalArrangement2;
  private Image Image1;
  private HorizontalArrangement HorizontalArrangement4;
  private HorizontalArrangement HorizontalArrangement3;
  private Button Button1;
  protected void $define() {
    this.AppName("HourOfCode");
    this.Icon("----.png");
    this.Title("Screen1");
    HorizontalArrangement1 = new HorizontalArrangement(this);
    HorizontalArrangement1.AlignHorizontal(3);
    HorizontalArrangement1.AlignVertical(3);
    HorizontalArrangement1.BackgroundColor(0x00FFFFFF);
    HorizontalArrangement1.Height(-1020);
    HorizontalArrangement1.Width(LENGTH_FILL_PARENT);
    Image2 = new Image(HorizontalArrangement1);
    Image2.Picture("!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!----.png");
    HorizontalArrangement2 = new HorizontalArrangement(this);
    HorizontalArrangement2.AlignHorizontal(3);
    HorizontalArrangement2.AlignVertical(2);
    HorizontalArrangement2.BackgroundColor(0x00FFFFFF);
    HorizontalArrangement2.Height(-1045);
    HorizontalArrangement2.Width(LENGTH_FILL_PARENT);
    Image1 = new Image(HorizontalArrangement2);
    Image1.Picture("!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!.png");
    HorizontalArrangement4 = new HorizontalArrangement(this);
    HorizontalArrangement4.BackgroundColor(0x00FFFFFF);
    HorizontalArrangement4.Height(-1005);
    HorizontalArrangement4.Width(LENGTH_FILL_PARENT);
    HorizontalArrangement3 = new HorizontalArrangement(this);
    HorizontalArrangement3.AlignHorizontal(3);
    HorizontalArrangement3.AlignVertical(2);
    HorizontalArrangement3.BackgroundColor(0x00FFFFFF);
    HorizontalArrangement3.Width(LENGTH_FILL_PARENT);
    Button1 = new Button(HorizontalArrangement3);
    Button1.BackgroundColor(0xEF5D79DE);
    Button1.FontBold(true);
    Button1.FontSize(20);
    Button1.Text("Menu");
    Button1.TextColor(0xFFFFFFFF);
  }
  public boolean dispatchEvent(Component component, String componentName, String eventName, Object[] params){
    return false;
  }
}
package org.appinventor;
import com.google.appinventor.components.runtime.HandlesEventDispatching;
import com.google.appinventor.components.runtime.EventDispatcher;
import com.google.appinventor.components.runtime.Form;
import com.google.appinventor.components.runtime.Component;
import com.google.appinventor.components.runtime.HorizontalArrangement;
import com.google.appinventor.components.runtime.Button;
import com.google.appinventor.components.runtime.Label;
class Screen2 extends Form implements HandlesEventDispatching {
  private HorizontalArrangement HorizontalArrangement6;
  private Button voltar;
  private HorizontalArrangement HorizontalArrangement4;
  private HorizontalArrangement HorizontalArrangement1;
  private Label Label1;
  private HorizontalArrangement HorizontalArrangement5;
  private HorizontalArrangement HorizontalArrangement2;
  private Button Biossenro;
  private HorizontalArrangement HorizontalArrangement3;
  private Button ajuda_e_informa����o;
  protected void $define() {
    this.AppName("HourOfCode");
    this.Title("Screen2");
    HorizontalArrangement6 = new HorizontalArrangement(this);
    HorizontalArrangement6.Height(-1005);
    HorizontalArrangement6.Width(LENGTH_FILL_PARENT);
    voltar = new Button(this);
    voltar.BackgroundColor(0xEF5D79DE);
    voltar.Text("Voltar");
    voltar.TextColor(0xFFFFFFFF);
    HorizontalArrangement4 = new HorizontalArrangement(this);
    HorizontalArrangement4.Height(-1010);
    HorizontalArrangement4.Width(LENGTH_FILL_PARENT);
    HorizontalArrangement1 = new HorizontalArrangement(this);
    HorizontalArrangement1.AlignHorizontal(3);
    HorizontalArrangement1.AlignVertical(2);
    HorizontalArrangement1.Height(-1007);
    HorizontalArrangement1.Width(LENGTH_FILL_PARENT);
    Label1 = new Label(HorizontalArrangement1);
    Label1.FontBold(true);
    Label1.FontSize(20);
    Label1.Text("Escolha uma op����o:");
    HorizontalArrangement5 = new HorizontalArrangement(this);
    HorizontalArrangement5.Height(-1005);
    HorizontalArrangement5.Width(LENGTH_FILL_PARENT);
    HorizontalArrangement2 = new HorizontalArrangement(this);
    HorizontalArrangement2.AlignHorizontal(3);
    HorizontalArrangement2.AlignVertical(2);
    HorizontalArrangement2.Width(LENGTH_FILL_PARENT);
    Biossenro = new Button(HorizontalArrangement2);
    Biossenro.BackgroundColor(0xEF5D79DE);
    Biossenro.FontSize(18);
    Biossenro.Width(-1070);
    Biossenro.Text("Biossensor");
    Biossenro.TextColor(0xFFFFFFFF);
    HorizontalArrangement3 = new HorizontalArrangement(this);
    HorizontalArrangement3.AlignHorizontal(3);
    HorizontalArrangement3.AlignVertical(2);
    HorizontalArrangement3.Width(LENGTH_FILL_PARENT);
    ajuda_e_informa����o = new Button(HorizontalArrangement3);
    ajuda_e_informa����o.BackgroundColor(0xEF5D79DE);
    ajuda_e_informa����o.FontSize(20);
    ajuda_e_informa����o.Width(-1070);
    ajuda_e_informa����o.ShowFeedback(false);
    ajuda_e_informa����o.Text("Ajuda e informa����o");
    ajuda_e_informa����o.TextColor(0xFFFFFFFF);
  }
  public boolean dispatchEvent(Component component, String componentName, String eventName, Object[] params){
    return false;
  }
}
package org.appinventor;
import com.google.appinventor.components.runtime.HandlesEventDispatching;
import com.google.appinventor.components.runtime.EventDispatcher;
import com.google.appinventor.components.runtime.Form;
import com.google.appinventor.components.runtime.Component;
import com.google.appinventor.components.runtime.HorizontalArrangement;
import com.google.appinventor.components.runtime.Button;
import com.google.appinventor.components.runtime.Label;
import com.google.appinventor.components.runtime.TextBox;
import com.google.appinventor.components.runtime.VerticalArrangement;
class Screen3 extends Form implements HandlesEventDispatching {
  private HorizontalArrangement HorizontalArrangement9;
  private Button voltar_para2;
  private HorizontalArrangement HorizontalArrangement4;
  private HorizontalArrangement HorizontalArrangement1;
  private Label Label1;
  private HorizontalArrangement HorizontalArrangement2;
  private TextBox digitar;
  private HorizontalArrangement HorizontalArrangement5;
  private HorizontalArrangement HorizontalArrangement3;
  private Button calcular;
  private HorizontalArrangement HorizontalArrangement7;
  private Label depor;
  private VerticalArrangement VerticalArrangement1;
  private Label concentra����o;
  private VerticalArrangement VerticalArrangement2;
  private Label corrente;
  protected void $define() {
    this.AppName("HourOfCode");
    this.Title("Screen3");
    HorizontalArrangement9 = new HorizontalArrangement(this);
    HorizontalArrangement9.Height(-1003);
    HorizontalArrangement9.Width(LENGTH_FILL_PARENT);
    voltar_para2 = new Button(this);
    voltar_para2.BackgroundColor(0xEF5D79DE);
    voltar_para2.Text("Voltar");
    voltar_para2.TextColor(0xFFFFFFFF);
    HorizontalArrangement4 = new HorizontalArrangement(this);
    HorizontalArrangement4.Height(-1003);
    HorizontalArrangement4.Width(LENGTH_FILL_PARENT);
    HorizontalArrangement1 = new HorizontalArrangement(this);
    HorizontalArrangement1.AlignHorizontal(3);
    HorizontalArrangement1.AlignVertical(3);
    HorizontalArrangement1.BackgroundColor(0x00FFFFFF);
    HorizontalArrangement1.Width(LENGTH_FILL_PARENT);
    Label1 = new Label(HorizontalArrangement1);
    Label1.FontBold(true);
    Label1.FontSize(25);
    Label1.Text("Digite o valor de corrente:");
    HorizontalArrangement2 = new HorizontalArrangement(this);
    HorizontalArrangement2.AlignHorizontal(3);
    HorizontalArrangement2.AlignVertical(2);
    HorizontalArrangement2.BackgroundColor(0x00FFFFFF);
    HorizontalArrangement2.Height(-1011);
    HorizontalArrangement2.Width(LENGTH_FILL_PARENT);
    digitar = new TextBox(HorizontalArrangement2);
    digitar.FontItalic(true);
    digitar.Height(-1010);
    digitar.Width(-1040);
    digitar.Hint("Exemplo: 0.50 (��A)");
    HorizontalArrangement5 = new HorizontalArrangement(this);
    HorizontalArrangement5.Height(-1002);
    HorizontalArrangement5.Width(LENGTH_FILL_PARENT);
    HorizontalArrangement3 = new HorizontalArrangement(this);
    HorizontalArrangement3.AlignHorizontal(3);
    HorizontalArrangement3.AlignVertical(3);
    HorizontalArrangement3.BackgroundColor(0x00FFFFFF);
    HorizontalArrangement3.Width(LENGTH_FILL_PARENT);
    calcular = new Button(HorizontalArrangement3);
    calcular.BackgroundColor(0xEF5D79DE);
    calcular.FontSize(18);
    calcular.Width(-1040);
    calcular.Text("Calcular");
    calcular.TextColor(0xFFFFFFFF);
    HorizontalArrangement7 = new HorizontalArrangement(this);
    HorizontalArrangement7.AlignHorizontal(3);
    HorizontalArrangement7.AlignVertical(2);
    HorizontalArrangement7.Height(-1015);
    HorizontalArrangement7.Width(LENGTH_FILL_PARENT);
    depor = new Label(HorizontalArrangement7);
    depor.FontBold(true);
    depor.Text("Resultado");
    depor.TextColor(0xFFFF0000);
    VerticalArrangement1 = new VerticalArrangement(this);
    VerticalArrangement1.AlignHorizontal(3);
    VerticalArrangement1.AlignVertical(2);
    VerticalArrangement1.Height(-1010);
    VerticalArrangement1.Width(LENGTH_FILL_PARENT);
    concentra����o = new Label(VerticalArrangement1);
    concentra����o.FontTypeface(3);
    concentra����o.Text("Concentra����o encontrada");
    VerticalArrangement2 = new VerticalArrangement(this);
    VerticalArrangement2.AlignHorizontal(3);
    VerticalArrangement2.AlignVertical(2);
    VerticalArrangement2.Height(-1010);
    VerticalArrangement2.Width(LENGTH_FILL_PARENT);
    corrente = new Label(VerticalArrangement2);
    corrente.Text("Avisos");
  }
  public boolean dispatchEvent(Component component, String componentName, String eventName, Object[] params){
    return false;
  }
}
package org.appinventor;
import com.google.appinventor.components.runtime.HandlesEventDispatching;
import com.google.appinventor.components.runtime.EventDispatcher;
import com.google.appinventor.components.runtime.Form;
import com.google.appinventor.components.runtime.Component;
import com.google.appinventor.components.runtime.HorizontalArrangement;
import com.google.appinventor.components.runtime.Button;
class Screen4 extends Form implements HandlesEventDispatching {
  private HorizontalArrangement HorizontalArrangement5;
  private Button voltar3;
  private Button oqedep;
  private HorizontalArrangement HorizontalArrangement8;
  private Button Button1;
  private HorizontalArrangement HorizontalArrangement1;
  private Button trata;
  private HorizontalArrangement HorizontalArrangement2;
  private Button lidar;
  private HorizontalArrangement HorizontalArrangement6;
  private Button classificacao;
  private HorizontalArrangement HorizontalArrangement7;
  private Button depecomorbidade;
  private HorizontalArrangement HorizontalArrangement9;
  private Button depressaoeidade;
  protected void $define() {
    this.AppName("HourOfCode");
    this.Title("Screen4");
    HorizontalArrangement5 = new HorizontalArrangement(this);
    HorizontalArrangement5.Height(-1001);
    HorizontalArrangement5.Width(LENGTH_FILL_PARENT);
    voltar3 = new Button(this);
    voltar3.BackgroundColor(0xEF5D79DE);
    voltar3.Text("Voltar");
    voltar3.TextColor(0xFFFFFFFF);
    oqedep = new Button(this);
    oqedep.BackgroundColor(0xEF5D79DE);
    oqedep.FontSize(18);
    oqedep.Width(LENGTH_FILL_PARENT);
    oqedep.Text("O que �� depress��o?");
    oqedep.TextColor(0xFFFFFFFF);
    HorizontalArrangement8 = new HorizontalArrangement(this);
    HorizontalArrangement8.Height(-1001);
    HorizontalArrangement8.Width(LENGTH_FILL_PARENT);
    Button1 = new Button(this);
    Button1.BackgroundColor(0xEF5D79DE);
    Button1.FontSize(18);
    Button1.Width(LENGTH_FILL_PARENT);
    Button1.Text("Sintomas");
    Button1.TextColor(0xFFFFFFFF);
    HorizontalArrangement1 = new HorizontalArrangement(this);
    HorizontalArrangement1.Height(-1001);
    HorizontalArrangement1.Width(LENGTH_FILL_PARENT);
    trata = new Button(this);
    trata.BackgroundColor(0xEF5D79DE);
    trata.FontSize(18);
    trata.Width(LENGTH_FILL_PARENT);
    trata.Text("Tratamentos");
    trata.TextColor(0xFFFFFFFF);
    HorizontalArrangement2 = new HorizontalArrangement(this);
    HorizontalArrangement2.Height(-1001);
    HorizontalArrangement2.Width(LENGTH_FILL_PARENT);
    lidar = new Button(this);
    lidar.BackgroundColor(0xEF5D79DE);
    lidar.FontSize(18);
    lidar.Width(LENGTH_FILL_PARENT);
    lidar.Text("Como lidar com pessoas com depress��o");
    lidar.TextColor(0xFFFFFFFF);
    HorizontalArrangement6 = new HorizontalArrangement(this);
    HorizontalArrangement6.Height(-1001);
    HorizontalArrangement6.Width(LENGTH_FILL_PARENT);
    classificacao = new Button(this);
    classificacao.BackgroundColor(0xEF5D79DE);
    classificacao.FontSize(18);
    classificacao.Width(LENGTH_FILL_PARENT);
    classificacao.Text("Classifica����o");
    classificacao.TextColor(0xFFFFFFFF);
    HorizontalArrangement7 = new HorizontalArrangement(this);
    HorizontalArrangement7.Height(-1001);
    HorizontalArrangement7.Width(LENGTH_FILL_PARENT);
    depecomorbidade = new Button(this);
    depecomorbidade.BackgroundColor(0xEF5D79DE);
    depecomorbidade.FontSize(18);
    depecomorbidade.Width(LENGTH_FILL_PARENT);
    depecomorbidade.Text("Depress��o e Comorbidade");
    depecomorbidade.TextColor(0xFFFFFFFF);
    HorizontalArrangement9 = new HorizontalArrangement(this);
    HorizontalArrangement9.Height(-1001);
    HorizontalArrangement9.Width(LENGTH_FILL_PARENT);
    depressaoeidade = new Button(this);
    depressaoeidade.BackgroundColor(0xEF5D79DE);
    depressaoeidade.FontSize(18);
    depressaoeidade.Width(LENGTH_FILL_PARENT);
    depressaoeidade.Text("Depress��o e Idade");
    depressaoeidade.TextColor(0xFFFFFFFF);
  }
  public boolean dispatchEvent(Component component, String componentName, String eventName, Object[] params){
    return false;
  }
}
package org.appinventor;
import com.google.appinventor.components.runtime.HandlesEventDispatching;
import com.google.appinventor.components.runtime.EventDispatcher;
import com.google.appinventor.components.runtime.Form;
import com.google.appinventor.components.runtime.Component;
import com.google.appinventor.components.runtime.Button;
import com.google.appinventor.components.runtime.HorizontalArrangement;
import com.google.appinventor.components.runtime.Label;
import com.google.appinventor.components.runtime.VerticalScrollArrangement;
class Sintomas extends Form implements HandlesEventDispatching {
  private Button Button1;
  private HorizontalArrangement HorizontalArrangement1;
  private HorizontalArrangement HorizontalArrangement2;
  private Label Label1;
  private VerticalScrollArrangement VerticalScrollArrangement1;
  private Label Label2;
  private Label Label3;
  private Label Label4;
  private Label Label6;
  private Label Label7;
  private Label Label8;
  private Label Label9;
  private Label Label10;
  private Label Label11;
  private Label Label12;
  private Label Label13;
  private Label Label14;
  private Label Label5;
  protected void $define() {
    this.AppName("HourOfCode");
    this.Title("Sintomas");
    Button1 = new Button(this);
    Button1.BackgroundColor(0xEF5D79DE);
    Button1.Text("Voltar");
    Button1.TextColor(0xFFFFFFFF);
    HorizontalArrangement1 = new HorizontalArrangement(this);
    HorizontalArrangement1.Height(-1002);
    HorizontalArrangement1.Width(LENGTH_FILL_PARENT);
    HorizontalArrangement2 = new HorizontalArrangement(this);
    HorizontalArrangement2.Height(-1005);
    HorizontalArrangement2.Width(LENGTH_FILL_PARENT);
    Label1 = new Label(HorizontalArrangement2);
    Label1.BackgroundColor(0xEF5D79DE);
    Label1.FontSize(20);
    Label1.Height(LENGTH_FILL_PARENT);
    Label1.Width(LENGTH_FILL_PARENT);
    Label1.Text("Sintomas");
    Label1.TextColor(0xFFFFFFFF);
    VerticalScrollArrangement1 = new VerticalScrollArrangement(this);
    VerticalScrollArrangement1.BackgroundColor(0xFFCCCCCC);
    VerticalScrollArrangement1.Height(LENGTH_FILL_PARENT);
    VerticalScrollArrangement1.Width(LENGTH_FILL_PARENT);
    Label2 = new Label(VerticalScrollArrangement1);
    Label2.FontBold(true);
    Label2.FontSize(13);
    Label2.Text("Sentimento de tristeza di��ria;");
    Label3 = new Label(VerticalScrollArrangement1);
    Label3.FontBold(true);
    Label3.FontSize(13);
    Label3.Height(-1003);
    Label3.Text("Desinteresse nas atividades que antes eram prazerosas;");
    Label4 = new Label(VerticalScrollArrangement1);
    Label4.FontBold(true);
    Label4.FontSize(13);
    Label4.Height(-1005);
    Label4.Width(LENGTH_FILL_PARENT);
    Label4.Text("Altera����o de peso (grande perda ou ganho de peso n��o intencional);");
    Label6 = new Label(VerticalScrollArrangement1);
    Label6.FontBold(true);
    Label6.FontSize(13);
    Label6.Height(-1003);
    Label6.Text(" Agita����o mental;");
    Label7 = new Label(VerticalScrollArrangement1);
    Label7.FontBold(true);
    Label7.FontSize(13);
    Label7.Height(-1006);
    Label7.Width(LENGTH_FILL_PARENT);
    Label7.Text("Apatia psicomotora (lentid��o na locomo����o e no pensamento);");
    Label8 = new Label(VerticalScrollArrangement1);
    Label8.FontBold(true);
    Label8.FontSize(13);
    Label8.Height(-1003);
    Label8.Width(LENGTH_FILL_PARENT);
    Label8.Text("Fadiga constante;");
    Label9 = new Label(VerticalScrollArrangement1);
    Label9.FontBold(true);
    Label9.FontSize(13);
    Label9.Height(-1005);
    Label9.Width(LENGTH_FILL_PARENT);
    Label9.Text("Sentimento de culpa e de inutilidade excessiva ou indevidas;");
    Label10 = new Label(VerticalScrollArrangement1);
    Label10.FontBold(true);
    Label10.FontSize(13);
    Label10.Text("Dificuldade de se concentrar;");
    Label11 = new Label(VerticalScrollArrangement1);
    Label11.FontBold(true);
    Label11.FontSize(13);
    Label11.Text("Ideias suicidas e autodestrutivas;");
    Label12 = new Label(VerticalScrollArrangement1);
    Label12.FontBold(true);
    Label12.FontSize(13);
    Label12.Text(" Baixa autoestima;");
    Label13 = new Label(VerticalScrollArrangement1);
    Label13.FontBold(true);
    Label13.FontSize(13);
    Label13.Text("Altera����o da libido;");
    Label14 = new Label(VerticalScrollArrangement1);
    Label14.FontBold(true);
    Label14.FontSize(13);
    Label14.Text("Comportamento compulsivos;");
    Label5 = new Label(VerticalScrollArrangement1);
    Label5.FontBold(true);
    Label5.FontSize(13);
    Label5.Height(LENGTH_FILL_PARENT);
    Label5.Width(LENGTH_FILL_PARENT);
    Label5.Text("Dificuldade para dormir (ins��nia ou sonol��ncia excessiva).");
  }
  public boolean dispatchEvent(Component component, String componentName, String eventName, Object[] params){
    return false;
  }
}
package org.appinventor;
import com.google.appinventor.components.runtime.HandlesEventDispatching;
import com.google.appinventor.components.runtime.EventDispatcher;
import com.google.appinventor.components.runtime.Form;
import com.google.appinventor.components.runtime.Component;
import com.google.appinventor.components.runtime.Button;
import com.google.appinventor.components.runtime.HorizontalArrangement;
import com.google.appinventor.components.runtime.Label;
import com.google.appinventor.components.runtime.VerticalArrangement;
class Terapiascomplemetares extends Form implements HandlesEventDispatching {
  private Button voltar;
  private HorizontalArrangement HorizontalArrangement1;
  private HorizontalArrangement HorizontalArrangement2;
  private Label Label1;
  private VerticalArrangement VerticalArrangement1;
  private Button Button1;
  private Button Button2;
  private Button Button3;
  private Button Button4;
  private Button Button5;
  private Button Button6;
  private Button Button7;
  private Button Button8;
  protected void $define() {
    this.AppName("HourOfCode");
    this.Title("Terapiascomplemetares");
    voltar = new Button(this);
    voltar.BackgroundColor(0xEF5D79DE);
    voltar.Text("Voltar");
    voltar.TextColor(0xFFFFFFFF);
    HorizontalArrangement1 = new HorizontalArrangement(this);
    HorizontalArrangement1.Height(-1002);
    HorizontalArrangement1.Width(LENGTH_FILL_PARENT);
    HorizontalArrangement2 = new HorizontalArrangement(this);
    HorizontalArrangement2.AlignHorizontal(3);
    HorizontalArrangement2.AlignVertical(2);
    HorizontalArrangement2.BackgroundColor(0xEF5D79DE);
    HorizontalArrangement2.Height(-1010);
    HorizontalArrangement2.Width(LENGTH_FILL_PARENT);
    Label1 = new Label(HorizontalArrangement2);
    Label1.BackgroundColor(0xEF5D79DE);
    Label1.FontSize(20);
    Label1.Text("Terapias Complementares");
    Label1.TextColor(0xFFFFFFFF);
    VerticalArrangement1 = new VerticalArrangement(this);
    VerticalArrangement1.AlignHorizontal(3);
    VerticalArrangement1.AlignVertical(2);
    VerticalArrangement1.BackgroundColor(0x00FFFFFF);
    VerticalArrangement1.Height(LENGTH_FILL_PARENT);
    VerticalArrangement1.Width(LENGTH_FILL_PARENT);
    Button1 = new Button(VerticalArrangement1);
    Button1.BackgroundColor(0xEF5D79DE);
    Button1.Width(-1040);
    Button1.Text("Fitoterapia");
    Button1.TextColor(0xFFFFFFFF);
    Button2 = new Button(VerticalArrangement1);
    Button2.BackgroundColor(0xEF5D79DE);
    Button2.Width(-1040);
    Button2.Text("Homeopatia");
    Button2.TextColor(0xFFFFFFFF);
    Button3 = new Button(VerticalArrangement1);
    Button3.BackgroundColor(0xEF5D79DE);
    Button3.Width(-1040);
    Button3.Text("Yoga");
    Button3.TextColor(0xFFFFFFFF);
    Button4 = new Button(VerticalArrangement1);
    Button4.BackgroundColor(0xEF5D79DE);
    Button4.Width(-1040);
    Button4.Text("Alimenta����o");
    Button4.TextColor(0xFFFFFFFF);
    Button5 = new Button(VerticalArrangement1);
    Button5.BackgroundColor(0xEF5D79DE);
    Button5.Width(-1040);
    Button5.Text("Exerc��cios f��sicos");
    Button5.TextColor(0xFFFFFFFF);
    Button6 = new Button(VerticalArrangement1);
    Button6.BackgroundColor(0xEF5D79DE);
    Button6.Width(-1040);
    Button6.Text("Medita����o");
    Button6.TextColor(0xFFFFFFFF);
    Button7 = new Button(VerticalArrangement1);
    Button7.BackgroundColor(0xEF5D79DE);
    Button7.Width(-1040);
    Button7.Text("Reiki");
    Button7.TextColor(0xFFFFFFFF);
    Button8 = new Button(VerticalArrangement1);
    Button8.BackgroundColor(0xEF5D79DE);
    Button8.Width(-1040);
    Button8.Text("Acupuntura");
    Button8.TextColor(0xFFFFFFFF);
  }
  public boolean dispatchEvent(Component component, String componentName, String eventName, Object[] params){
    return false;
  }
}
package org.appinventor;
import com.google.appinventor.components.runtime.HandlesEventDispatching;
import com.google.appinventor.components.runtime.EventDispatcher;
import com.google.appinventor.components.runtime.Form;
import com.google.appinventor.components.runtime.Component;
import com.google.appinventor.components.runtime.Button;
import com.google.appinventor.components.runtime.HorizontalArrangement;
import com.google.appinventor.components.runtime.Label;
class Transtornodepressivomaior extends Form implements HandlesEventDispatching {
  private Button Button1;
  private HorizontalArrangement HorizontalArrangement1;
  private HorizontalArrangement HorizontalArrangement2;
  private Label Label1;
  private HorizontalArrangement HorizontalArrangement3;
  private HorizontalArrangement HorizontalArrangement4;
  private Label Label2;
  private HorizontalArrangement HorizontalArrangement5;
  private Label Label3;
  private HorizontalArrangement HorizontalArrangement6;
  private Label Label4;
  private HorizontalArrangement HorizontalArrangement10;
  private Label Label5;
  private HorizontalArrangement HorizontalArrangement9;
  private Label Label6;
  private HorizontalArrangement HorizontalArrangement8;
  private Label Label7;
  private HorizontalArrangement HorizontalArrangement7;
  private Label Label8;
  protected void $define() {
    this.AppName("HourOfCode");
    this.Title("Transtornodepressivomaior");
    Button1 = new Button(this);
    Button1.BackgroundColor(0xEF5D79DE);
    Button1.Text("Voltar");
    Button1.TextColor(0xFFFFFFFF);
    HorizontalArrangement1 = new HorizontalArrangement(this);
    HorizontalArrangement1.Height(-1002);
    HorizontalArrangement1.Width(LENGTH_FILL_PARENT);
    HorizontalArrangement2 = new HorizontalArrangement(this);
    HorizontalArrangement2.AlignHorizontal(3);
    HorizontalArrangement2.AlignVertical(2);
    HorizontalArrangement2.BackgroundColor(0xEF5D79DE);
    HorizontalArrangement2.Height(-1010);
    HorizontalArrangement2.Width(LENGTH_FILL_PARENT);
    Label1 = new Label(HorizontalArrangement2);
    Label1.FontSize(20);
    Label1.Text("Transtorno depressivo maior");
    Label1.TextColor(0xFFFFFFFF);
    HorizontalArrangement3 = new HorizontalArrangement(this);
    HorizontalArrangement3.Height(-1001);
    HorizontalArrangement3.Width(LENGTH_FILL_PARENT);
    HorizontalArrangement4 = new HorizontalArrangement(this);
    HorizontalArrangement4.AlignHorizontal(3);
    HorizontalArrangement4.AlignVertical(2);
    HorizontalArrangement4.Height(-1017);
    HorizontalArrangement4.Width(LENGTH_FILL_PARENT);
    Label2 = new Label(HorizontalArrangement4);
    Label2.FontBold(true);
    Label2.FontSize(17);
    Label2.Height(LENGTH_FILL_PARENT);
    Label2.Width(LENGTH_FILL_PARENT);
    Label2.Text("Depress��o grave. As pessoas que possuem esse transtorno ficam deprimidas na maior parte do dia, por no m��nimo 15 dias. Apresentam:");
    HorizontalArrangement5 = new HorizontalArrangement(this);
    Label3 = new Label(HorizontalArrangement5);
    Label3.FontBold(true);
    Label3.FontSize(17);
    Label3.Text("Estar infelizes;");
    HorizontalArrangement6 = new HorizontalArrangement(this);
    Label4 = new Label(HorizontalArrangement6);
    Label4.FontBold(true);
    Label4.FontSize(17);
    Label4.Text("Olhos podem ficar com l��grimas;");
    HorizontalArrangement10 = new HorizontalArrangement(this);
    Label5 = new Label(HorizontalArrangement10);
    Label5.FontBold(true);
    Label5.FontSize(17);
    Label5.Text("Des��nimo e evitam contato ocular;");
    HorizontalArrangement9 = new HorizontalArrangement(this);
    HorizontalArrangement9.Height(-1010);
    Label6 = new Label(HorizontalArrangement9);
    Label6.FontBold(true);
    Label6.FontSize(17);
    Label6.Height(-1010);
    Label6.Width(-1080);
    Label6.Text("Poucas express��es faciais e evitam longas conversas;");
    HorizontalArrangement8 = new HorizontalArrangement(this);
    HorizontalArrangement8.Height(-1010);
    HorizontalArrangement8.Width(-1080);
    Label7 = new Label(HorizontalArrangement8);
    Label7.FontBold(true);
    Label7.FontSize(17);
    Label7.Height(LENGTH_FILL_PARENT);
    Label7.Width(LENGTH_FILL_PARENT);
    Label7.Text("Ins��nia ou muito sono, fadiga e pensamentos suicidas;");
    HorizontalArrangement7 = new HorizontalArrangement(this);
    HorizontalArrangement7.Height(-1010);
    HorizontalArrangement7.Width(-1080);
    Label8 = new Label(HorizontalArrangement7);
    Label8.FontBold(true);
    Label8.FontSize(17);
    Label8.Height(LENGTH_FILL_PARENT);
    Label8.Width(LENGTH_FILL_PARENT);
    Label8.Text("Tentativas de suic��dio ou planejamento para cometer suic��dio.");
  }
  public boolean dispatchEvent(Component component, String componentName, String eventName, Object[] params){
    return false;
  }
}
package org.appinventor;
import com.google.appinventor.components.runtime.HandlesEventDispatching;
import com.google.appinventor.components.runtime.EventDispatcher;
import com.google.appinventor.components.runtime.Form;
import com.google.appinventor.components.runtime.Component;
import com.google.appinventor.components.runtime.Button;
import com.google.appinventor.components.runtime.HorizontalArrangement;
import com.google.appinventor.components.runtime.Label;
class Transtornodepressivopersistente extends Form implements HandlesEventDispatching {
  private Button Button1;
  private HorizontalArrangement HorizontalArrangement1;
  private HorizontalArrangement HorizontalArrangement2;
  private Label Label1;
  private HorizontalArrangement HorizontalArrangement3;
  private HorizontalArrangement HorizontalArrangement4;
  private Label Label2;
  private HorizontalArrangement HorizontalArrangement11;
  private Label Label3;
  private HorizontalArrangement HorizontalArrangement10;
  private Label Label4;
  private HorizontalArrangement HorizontalArrangement7;
  private Label Label5;
  private HorizontalArrangement HorizontalArrangement5;
  private Label Label6;
  private HorizontalArrangement HorizontalArrangement13;
  private Label Label8;
  private HorizontalArrangement HorizontalArrangement14;
  private Label Label9;
  protected void $define() {
    this.AppName("HourOfCode");
    this.Title("Transtornodepressivopersistente");
    Button1 = new Button(this);
    Button1.BackgroundColor(0xEF5D79DE);
    Button1.Text("Voltar");
    Button1.TextColor(0xFFFFFFFF);
    HorizontalArrangement1 = new HorizontalArrangement(this);
    HorizontalArrangement1.Height(-1002);
    HorizontalArrangement1.Width(LENGTH_FILL_PARENT);
    HorizontalArrangement2 = new HorizontalArrangement(this);
    HorizontalArrangement2.Height(-1010);
    HorizontalArrangement2.Width(LENGTH_FILL_PARENT);
    Label1 = new Label(HorizontalArrangement2);
    Label1.BackgroundColor(0xEF5D79DE);
    Label1.FontSize(20);
    Label1.Height(LENGTH_FILL_PARENT);
    Label1.Width(LENGTH_FILL_PARENT);
    Label1.Text("Transtorno depressivo persistente");
    Label1.TextColor(0xFFFFFFFF);
    HorizontalArrangement3 = new HorizontalArrangement(this);
    HorizontalArrangement3.Height(-1002);
    HorizontalArrangement3.Width(LENGTH_FILL_PARENT);
    HorizontalArrangement4 = new HorizontalArrangement(this);
    HorizontalArrangement4.AlignHorizontal(3);
    HorizontalArrangement4.AlignVertical(2);
    HorizontalArrangement4.Height(-1022);
    HorizontalArrangement4.Width(LENGTH_FILL_PARENT);
    Label2 = new Label(HorizontalArrangement4);
    Label2.FontBold(true);
    Label2.FontSize(15);
    Label2.Height(LENGTH_FILL_PARENT);
    Label2.Width(LENGTH_FILL_PARENT);
    Label2.Text("Distimia (depress��o leve ou moderada). As pessoas com esse quadro, apresentam sintomas cl��nicos da depress��o por mais de dois anos. Sendo que os sintomas podem surgir aos poucos na adolesc��ncia e prolongar at�� a vida adulta. As pessoas com esse transtorno apresentam:");
    HorizontalArrangement11 = new HorizontalArrangement(this);
    Label3 = new Label(HorizontalArrangement11);
    Label3.Text("Sentimentos de tristeza;");
    HorizontalArrangement10 = new HorizontalArrangement(this);
    Label4 = new Label(HorizontalArrangement10);
    Label4.Text("Pessimismo;");
    HorizontalArrangement7 = new HorizontalArrangement(this);
    Label5 = new Label(HorizontalArrangement7);
    Label5.Text("Irritabilidade;");
    HorizontalArrangement5 = new HorizontalArrangement(this);
    Label6 = new Label(HorizontalArrangement5);
    Label6.Text("Muito auto-cr��ticas;");
    HorizontalArrangement13 = new HorizontalArrangement(this);
    Label8 = new Label(HorizontalArrangement13);
    Label8.Text("Melancolia e s��o introvertidos;");
    HorizontalArrangement14 = new HorizontalArrangement(this);
    HorizontalArrangement14.Height(LENGTH_FILL_PARENT);
    HorizontalArrangement14.Width(LENGTH_FILL_PARENT);
    Label9 = new Label(HorizontalArrangement14);
    Label9.Height(LENGTH_FILL_PARENT);
    Label9.Width(LENGTH_FILL_PARENT);
    Label9.Text("Maior probabilidade de ter ansiedade, recorrer ao uso de drogas .");
  }
  public boolean dispatchEvent(Component component, String componentName, String eventName, Object[] params){
    return false;
  }
}
package org.appinventor;
import com.google.appinventor.components.runtime.HandlesEventDispatching;
import com.google.appinventor.components.runtime.EventDispatcher;
import com.google.appinventor.components.runtime.Form;
import com.google.appinventor.components.runtime.Component;
import com.google.appinventor.components.runtime.Button;
import com.google.appinventor.components.runtime.HorizontalArrangement;
import com.google.appinventor.components.runtime.Label;
class classederemedios extends Form implements HandlesEventDispatching {
  private Button Button1;
  private HorizontalArrangement HorizontalArrangement1;
  private Label Label2;
  private HorizontalArrangement HorizontalArrangement2;
  private Label Label1;
  protected void $define() {
    this.AppName("HourOfCode");
    this.Title("classederemedios");
    Button1 = new Button(this);
    Button1.BackgroundColor(0xEF5D79DE);
    Button1.Text("Voltar");
    Button1.TextColor(0xFFFFFFFF);
    HorizontalArrangement1 = new HorizontalArrangement(this);
    HorizontalArrangement1.AlignHorizontal(3);
    HorizontalArrangement1.AlignVertical(2);
    HorizontalArrangement1.BackgroundColor(0xEF5D79DE);
    HorizontalArrangement1.Height(-1010);
    HorizontalArrangement1.Width(LENGTH_FILL_PARENT);
    Label2 = new Label(HorizontalArrangement1);
    Label2.FontBold(true);
    Label2.FontSize(19);
    Label2.Text("Classes de rem��dios mais utilizados");
    Label2.TextColor(0xFFFFFFFF);
    HorizontalArrangement2 = new HorizontalArrangement(this);
    HorizontalArrangement2.AlignHorizontal(3);
    HorizontalArrangement2.AlignVertical(2);
    HorizontalArrangement2.BackgroundColor(0xFFCCCCCC);
    HorizontalArrangement2.Height(-1040);
    HorizontalArrangement2.Width(LENGTH_FILL_PARENT);
    Label1 = new Label(HorizontalArrangement2);
    Label1.FontBold(true);
    Label1.FontSize(17);
    Label1.Height(LENGTH_FILL_PARENT);
    Label1.Width(LENGTH_FILL_PARENT);
    Label1.Text("inibidores seletivos da recapta����o da serotonina, Moduladores da serotonina (bloqueadores 5-HT2), Inibidores de recapta����o de serotonina e noradrenalina, Inibidores de recapta����o de dopamina e noradrenalina, Antidepressivos heteroc��clicos, Inibidores monoaminoxidase (IMAOs) e Antidepressivo melaton��rgico. ");
  }
  public boolean dispatchEvent(Component component, String componentName, String eventName, Object[] params){
    return false;
  }
}
package org.appinventor;
import com.google.appinventor.components.runtime.HandlesEventDispatching;
import com.google.appinventor.components.runtime.EventDispatcher;
import com.google.appinventor.components.runtime.Form;
import com.google.appinventor.components.runtime.Component;
import com.google.appinventor.components.runtime.Button;
import com.google.appinventor.components.runtime.HorizontalArrangement;
import com.google.appinventor.components.runtime.Label;
class classificacao extends Form implements HandlesEventDispatching {
  private Button voltar;
  private HorizontalArrangement HorizontalArrangement1;
  private HorizontalArrangement HorizontalArrangement2;
  private Label Label1;
  private HorizontalArrangement HorizontalArrangement3;
  private HorizontalArrangement HorizontalArrangement4;
  private Button transtordepmaior;
  private HorizontalArrangement HorizontalArrangement6;
  private HorizontalArrangement HorizontalArrangement5;
  private Button transtornodeppersistente;
  protected void $define() {
    this.AppName("HourOfCode");
    this.Title("classificacao");
    voltar = new Button(this);
    voltar.BackgroundColor(0xEF5D79DE);
    voltar.Text("Voltar");
    voltar.TextColor(0xFFFFFFFF);
    HorizontalArrangement1 = new HorizontalArrangement(this);
    HorizontalArrangement1.Height(-1002);
    HorizontalArrangement1.Width(LENGTH_FILL_PARENT);
    HorizontalArrangement2 = new HorizontalArrangement(this);
    HorizontalArrangement2.AlignHorizontal(3);
    HorizontalArrangement2.AlignVertical(2);
    HorizontalArrangement2.BackgroundColor(0xEF5D79DE);
    HorizontalArrangement2.Height(-1010);
    HorizontalArrangement2.Width(LENGTH_FILL_PARENT);
    Label1 = new Label(HorizontalArrangement2);
    Label1.FontBold(true);
    Label1.FontSize(20);
    Label1.Text("Classifica����o");
    Label1.TextColor(0xFFFFFFFF);
    HorizontalArrangement3 = new HorizontalArrangement(this);
    HorizontalArrangement3.Height(-1002);
    HorizontalArrangement3.Width(LENGTH_FILL_PARENT);
    HorizontalArrangement4 = new HorizontalArrangement(this);
    HorizontalArrangement4.Height(-1010);
    HorizontalArrangement4.Width(LENGTH_FILL_PARENT);
    transtordepmaior = new Button(HorizontalArrangement4);
    transtordepmaior.BackgroundColor(0xEF5D79DE);
    transtordepmaior.FontSize(17);
    transtordepmaior.Height(LENGTH_FILL_PARENT);
    transtordepmaior.Width(LENGTH_FILL_PARENT);
    transtordepmaior.Text("Transtorno depressivo maior");
    transtordepmaior.TextColor(0xFFFFFFFF);
    HorizontalArrangement6 = new HorizontalArrangement(this);
    HorizontalArrangement6.Height(-1005);
    HorizontalArrangement6.Width(LENGTH_FILL_PARENT);
    HorizontalArrangement5 = new HorizontalArrangement(this);
    HorizontalArrangement5.Height(-1010);
    HorizontalArrangement5.Width(LENGTH_FILL_PARENT);
    transtornodeppersistente = new Button(HorizontalArrangement5);
    transtornodeppersistente.BackgroundColor(0xEF5D79DE);
    transtornodeppersistente.FontSize(17);
    transtornodeppersistente.Height(LENGTH_FILL_PARENT);
    transtornodeppersistente.Width(LENGTH_FILL_PARENT);
    transtornodeppersistente.Text("Transtorno depressivo persistente");
    transtornodeppersistente.TextColor(0xFFFFFFFF);
  }
  public boolean dispatchEvent(Component component, String componentName, String eventName, Object[] params){
    return false;
  }
}
package org.appinventor;
import com.google.appinventor.components.runtime.HandlesEventDispatching;
import com.google.appinventor.components.runtime.EventDispatcher;
import com.google.appinventor.components.runtime.Form;
import com.google.appinventor.components.runtime.Component;
import com.google.appinventor.components.runtime.Button;
import com.google.appinventor.components.runtime.HorizontalArrangement;
import com.google.appinventor.components.runtime.Label;
class comoajudaralguemcomdepressao extends Form implements HandlesEventDispatching {
  private Button Button1;
  private HorizontalArrangement HorizontalArrangement1;
  private HorizontalArrangement HorizontalArrangement2;
  private Label Label1;
  private HorizontalArrangement HorizontalArrangement3;
  private HorizontalArrangement HorizontalArrangement4;
  private Label Label2;
  protected void $define() {
    this.AppName("HourOfCode");
    this.Title("comoajudaralguemcomdepressao");
    Button1 = new Button(this);
    Button1.BackgroundColor(0xEF5D79DE);
    Button1.Text("Voltar");
    Button1.TextColor(0xFFFFFFFF);
    HorizontalArrangement1 = new HorizontalArrangement(this);
    HorizontalArrangement1.Height(-1002);
    HorizontalArrangement1.Width(LENGTH_FILL_PARENT);
    HorizontalArrangement2 = new HorizontalArrangement(this);
    HorizontalArrangement2.AlignHorizontal(3);
    HorizontalArrangement2.AlignVertical(2);
    HorizontalArrangement2.BackgroundColor(0xEF5D79DE);
    HorizontalArrangement2.Height(-1010);
    HorizontalArrangement2.Width(LENGTH_FILL_PARENT);
    Label1 = new Label(HorizontalArrangement2);
    Label1.FontSize(19);
    Label1.Text("Como ajudar algu��m com depress��o?");
    Label1.TextColor(0xFFFFFFFF);
    HorizontalArrangement3 = new HorizontalArrangement(this);
    HorizontalArrangement3.Height(-1002);
    HorizontalArrangement3.Width(LENGTH_FILL_PARENT);
    HorizontalArrangement4 = new HorizontalArrangement(this);
    HorizontalArrangement4.BackgroundColor(0xFFCCCCCC);
    HorizontalArrangement4.Height(LENGTH_FILL_PARENT);
    HorizontalArrangement4.Width(LENGTH_FILL_PARENT);
    Label2 = new Label(HorizontalArrangement4);
    Label2.FontBold(true);
    Label2.FontSize(17);
    Label2.Height(LENGTH_FILL_PARENT);
    Label2.Width(LENGTH_FILL_PARENT);
    Label2.Text("A depress��o �� um transtorno m��dico s��rio e grave, que necessita de tratamento urgente. Os entes queridos e amigos do paciente, devem lembrar que a depress��o n��o significa falha de car��ter, como pregui��a, fraqueza ou exibicionismo. Esclarecer sobre a depress��o pode estimular as pessoas a enfrentar a doen��a. De modo que, os pacientes compreendam que a recupera����o �� complicada e que poder��o surgir momentos de tristeza e de pensamentos ruins, mas isso ter�� um fim, mediante ajuda e tratamento.  ");
  }
  public boolean dispatchEvent(Component component, String componentName, String eventName, Object[] params){
    return false;
  }
}
package org.appinventor;
import com.google.appinventor.components.runtime.HandlesEventDispatching;
import com.google.appinventor.components.runtime.EventDispatcher;
import com.google.appinventor.components.runtime.Form;
import com.google.appinventor.components.runtime.Component;
import com.google.appinventor.components.runtime.Button;
import com.google.appinventor.components.runtime.VerticalArrangement;
import com.google.appinventor.components.runtime.HorizontalArrangement;
import com.google.appinventor.components.runtime.Label;
class comolidar extends Form implements HandlesEventDispatching {
  private Button Button1;
  private VerticalArrangement VerticalArrangement1;
  private HorizontalArrangement HorizontalArrangement1;
  private Label Label1;
  private HorizontalArrangement HorizontalArrangement2;
  private Label Label2;
  private HorizontalArrangement HorizontalArrangement3;
  private Button Button2;
  private HorizontalArrangement HorizontalArrangement4;
  private Button Button3;
  private HorizontalArrangement HorizontalArrangement5;
  private Button Button4;
  private Label Label3;
  protected void $define() {
    this.AppName("HourOfCode");
    this.Title("comolidar");
    Button1 = new Button(this);
    Button1.BackgroundColor(0xEF5D79DE);
    Button1.Text("Voltar");
    Button1.TextColor(0xFFFFFFFF);
    VerticalArrangement1 = new VerticalArrangement(this);
    VerticalArrangement1.BackgroundColor(0xEF5D79DE);
    VerticalArrangement1.Width(LENGTH_FILL_PARENT);
    HorizontalArrangement1 = new HorizontalArrangement(VerticalArrangement1);
    HorizontalArrangement1.AlignHorizontal(3);
    HorizontalArrangement1.AlignVertical(2);
    HorizontalArrangement1.BackgroundColor(0x00FFFFFF);
    HorizontalArrangement1.Height(-1007);
    HorizontalArrangement1.Width(LENGTH_FILL_PARENT);
    Label1 = new Label(HorizontalArrangement1);
    Label1.FontBold(true);
    Label1.FontSize(20);
    Label1.Text("Lidando com pessoas");
    Label1.TextColor(0xFFFFFFFF);
    HorizontalArrangement2 = new HorizontalArrangement(VerticalArrangement1);
    HorizontalArrangement2.AlignHorizontal(3);
    HorizontalArrangement2.AlignVertical(2);
    HorizontalArrangement2.BackgroundColor(0x00FFFFFF);
    HorizontalArrangement2.Height(-1007);
    HorizontalArrangement2.Width(LENGTH_FILL_PARENT);
    Label2 = new Label(HorizontalArrangement2);
    Label2.FontBold(true);
    Label2.FontSize(20);
    Label2.Text("com depress��o");
    Label2.TextColor(0xFFFFFFFF);
    HorizontalArrangement3 = new HorizontalArrangement(this);
    HorizontalArrangement3.Height(-1005);
    HorizontalArrangement3.Width(LENGTH_FILL_PARENT);
    Button2 = new Button(this);
    Button2.BackgroundColor(0xEF5D79DE);
    Button2.FontBold(true);
    Button2.Width(LENGTH_FILL_PARENT);
    Button2.Text("Como perceber os sintomas?");
    Button2.TextColor(0xFFFFFFFF);
    HorizontalArrangement4 = new HorizontalArrangement(this);
    HorizontalArrangement4.Height(-1005);
    HorizontalArrangement4.Width(LENGTH_FILL_PARENT);
    Button3 = new Button(this);
    Button3.BackgroundColor(0xEF5D79DE);
    Button3.FontBold(true);
    Button3.Width(LENGTH_FILL_PARENT);
    Button3.Text("Como ajudar algu��m com depress��o?");
    Button3.TextColor(0xFFFFFFFF);
    HorizontalArrangement5 = new HorizontalArrangement(this);
    HorizontalArrangement5.Height(-1005);
    HorizontalArrangement5.Width(LENGTH_FILL_PARENT);
    Button4 = new Button(this);
    Button4.BackgroundColor(0xEF5D79DE);
    Button4.FontBold(true);
    Button4.Width(LENGTH_FILL_PARENT);
    Button4.Text("Depress��o e Suic��dio.");
    Button4.TextColor(0xFFFFFFFF);
    Label3 = new Label(this);
    Label3.Height(-1060);
    Label3.Width(LENGTH_FILL_PARENT);
  }
  public boolean dispatchEvent(Component component, String componentName, String eventName, Object[] params){
    return false;
  }
}
package org.appinventor;
import com.google.appinventor.components.runtime.HandlesEventDispatching;
import com.google.appinventor.components.runtime.EventDispatcher;
import com.google.appinventor.components.runtime.Form;
import com.google.appinventor.components.runtime.Component;
import com.google.appinventor.components.runtime.Button;
import com.google.appinventor.components.runtime.HorizontalArrangement;
import com.google.appinventor.components.runtime.Label;
import com.google.appinventor.components.runtime.VerticalArrangement;
class depeidade extends Form implements HandlesEventDispatching {
  private Button voltar44;
  private HorizontalArrangement HorizontalArrangement2;
  private HorizontalArrangement HorizontalArrangement1;
  private Label Label1;
  private HorizontalArrangement HorizontalArrangement4;
  private Label Label2;
  private VerticalArrangement VerticalArrangement1;
  private Label Label3;
  private Label Label4;
  private Label Label5;
  private Label Label6;
  protected void $define() {
    this.AboutScreen("Depinfantil");
    this.AppName("HourOfCode");
    this.Title("depeidade");
    voltar44 = new Button(this);
    voltar44.BackgroundColor(0xEF5D79DE);
    voltar44.Text("Voltar");
    voltar44.TextColor(0xFFFFFFFF);
    HorizontalArrangement2 = new HorizontalArrangement(this);
    HorizontalArrangement2.Height(-1002);
    HorizontalArrangement2.Width(LENGTH_FILL_PARENT);
    HorizontalArrangement1 = new HorizontalArrangement(this);
    HorizontalArrangement1.AlignHorizontal(3);
    HorizontalArrangement1.AlignVertical(2);
    HorizontalArrangement1.BackgroundColor(0xEF5D79DE);
    HorizontalArrangement1.Width(LENGTH_FILL_PARENT);
    Label1 = new Label(HorizontalArrangement1);
    Label1.FontBold(true);
    Label1.FontSize(20);
    Label1.Text("Depress��o infantil");
    Label1.TextColor(0xFFFFFFFF);
    HorizontalArrangement4 = new HorizontalArrangement(this);
    HorizontalArrangement4.BackgroundColor(0xFFCCCCCC);
    HorizontalArrangement4.Height(-1050);
    HorizontalArrangement4.Width(LENGTH_FILL_PARENT);
    Label2 = new Label(HorizontalArrangement4);
    Label2.FontBold(true);
    Label2.FontSize(17);
    Label2.Height(-1050);
    Label2.Width(LENGTH_FILL_PARENT);
    Label2.Text("A ocorr��ncia da depress��o em crian��as, pode apresentar consequ��ncias traum��ticas e recorrentes para a vida da pessoa. A manifesta����o cl��nica da depress��o em crian��as menores que 7 anos, s��o geralmente sintomas f��sicos, de modo que as crian��as reclamam de dores de cabe��a e de barriga, fadiga e tonturas, sendo seguidas por ansiedade de separa����o, fobias, hiperatividade, irritabilidade, perda de apetite e problemas para dormir. ");
    VerticalArrangement1 = new VerticalArrangement(this);
    VerticalArrangement1.AlignHorizontal(3);
    VerticalArrangement1.BackgroundColor(0xFFCCCCCC);
    VerticalArrangement1.Height(LENGTH_FILL_PARENT);
    VerticalArrangement1.Width(LENGTH_FILL_PARENT);
    Label3 = new Label(VerticalArrangement1);
    Label3.FontBold(true);
    Label3.FontSize(15);
    Label3.Text("Principais Causas:");
    Label4 = new Label(VerticalArrangement1);
    Label4.FontBold(true);
    Label4.Text("Fator heredit��rio;");
    Label5 = new Label(VerticalArrangement1);
    Label5.FontBold(true);
    Label5.Text("Epis��dio traum��tico;");
    Label6 = new Label(VerticalArrangement1);
    Label6.FontBold(true);
    Label6.Text("Anormalidade na qu��mica cerebral");
  }
  public boolean dispatchEvent(Component component, String componentName, String eventName, Object[] params){
    return false;
  }
}
package org.appinventor;
import com.google.appinventor.components.runtime.HandlesEventDispatching;
import com.google.appinventor.components.runtime.EventDispatcher;
import com.google.appinventor.components.runtime.Form;
import com.google.appinventor.components.runtime.Component;
import com.google.appinventor.components.runtime.Button;
import com.google.appinventor.components.runtime.HorizontalArrangement;
import com.google.appinventor.components.runtime.Label;
import com.google.appinventor.components.runtime.VerticalArrangement;
class depressaoecancer extends Form implements HandlesEventDispatching {
  private Button Button1;
  private HorizontalArrangement HorizontalArrangement1;
  private HorizontalArrangement HorizontalArrangement2;
  private Label Label1;
  private VerticalArrangement VerticalArrangement1;
  private Label Label2;
  protected void $define() {
    this.AppName("HourOfCode");
    this.Title("depressaoecancer");
    Button1 = new Button(this);
    Button1.BackgroundColor(0xEF5D79DE);
    Button1.Text("Voltar");
    Button1.TextColor(0xFFFFFFFF);
    HorizontalArrangement1 = new HorizontalArrangement(this);
    HorizontalArrangement1.Height(-1002);
    HorizontalArrangement2 = new HorizontalArrangement(this);
    HorizontalArrangement2.AlignHorizontal(3);
    HorizontalArrangement2.AlignVertical(2);
    HorizontalArrangement2.BackgroundColor(0xEF5D79DE);
    HorizontalArrangement2.Height(-1010);
    HorizontalArrangement2.Width(LENGTH_FILL_PARENT);
    Label1 = new Label(HorizontalArrangement2);
    Label1.FontBold(true);
    Label1.FontSize(20);
    Label1.Height(LENGTH_FILL_PARENT);
    Label1.Text("Depress��o e c��ncer");
    Label1.TextColor(0xFFFFFFFF);
    VerticalArrangement1 = new VerticalArrangement(this);
    VerticalArrangement1.AlignHorizontal(3);
    VerticalArrangement1.AlignVertical(2);
    VerticalArrangement1.BackgroundColor(0xFFCCCCCC);
    VerticalArrangement1.Height(-1050);
    VerticalArrangement1.Width(LENGTH_FILL_PARENT);
    Label2 = new Label(VerticalArrangement1);
    Label2.FontBold(true);
    Label2.FontSize(17);
    Label2.Height(LENGTH_FILL_PARENT);
    Label2.Width(LENGTH_FILL_PARENT);
    Label2.Text("Os pacientes oncol��gicos, quando possuem depress��o, apresentam maior dificuldade em aceitar o tratamento. Considerando que quando o paciente recebe a not��cia do c��ncer, frequentemente s��o observadas rea����es de tristeza e ���choque��?, seguidos por um per��odo emocional dif��cil. Dessa forma, �� importante, al��m do tratamento oncol��gico, considerar um tratamento para o transtorno depressivo.");
  }
  public boolean dispatchEvent(Component component, String componentName, String eventName, Object[] params){
    return false;
  }
}
package org.appinventor;
import com.google.appinventor.components.runtime.HandlesEventDispatching;
import com.google.appinventor.components.runtime.EventDispatcher;
import com.google.appinventor.components.runtime.Form;
import com.google.appinventor.components.runtime.Component;
import com.google.appinventor.components.runtime.Button;
import com.google.appinventor.components.runtime.HorizontalArrangement;
import com.google.appinventor.components.runtime.Label;
import com.google.appinventor.components.runtime.VerticalArrangement;
class depressaoehiv extends Form implements HandlesEventDispatching {
  private Button Button1;
  private HorizontalArrangement HorizontalArrangement1;
  private HorizontalArrangement HorizontalArrangement2;
  private Label Label1;
  private VerticalArrangement VerticalArrangement1;
  private Label Label2;
  protected void $define() {
    this.AppName("HourOfCode");
    this.Title("depressaoehiv");
    Button1 = new Button(this);
    Button1.BackgroundColor(0xEF5D79DE);
    Button1.Text("Voltar");
    Button1.TextColor(0xFFFFFFFF);
    HorizontalArrangement1 = new HorizontalArrangement(this);
    HorizontalArrangement1.Height(-1002);
    HorizontalArrangement2 = new HorizontalArrangement(this);
    HorizontalArrangement2.AlignHorizontal(3);
    HorizontalArrangement2.AlignVertical(2);
    HorizontalArrangement2.Height(-1010);
    HorizontalArrangement2.Width(LENGTH_FILL_PARENT);
    Label1 = new Label(HorizontalArrangement2);
    Label1.BackgroundColor(0xEF5D79DE);
    Label1.FontBold(true);
    Label1.FontSize(20);
    Label1.Height(LENGTH_FILL_PARENT);
    Label1.Width(LENGTH_FILL_PARENT);
    Label1.Text("Depress��o e HIV");
    Label1.TextColor(0xFFFFFFFF);
    VerticalArrangement1 = new VerticalArrangement(this);
    VerticalArrangement1.AlignHorizontal(3);
    VerticalArrangement1.AlignVertical(2);
    VerticalArrangement1.BackgroundColor(0xFFCCCCCC);
    VerticalArrangement1.Height(LENGTH_FILL_PARENT);
    VerticalArrangement1.Width(LENGTH_FILL_PARENT);
    Label2 = new Label(VerticalArrangement1);
    Label2.FontBold(true);
    Label2.FontSize(17);
    Label2.Height(LENGTH_FILL_PARENT);
    Label2.Width(LENGTH_FILL_PARENT);
    Label2.Text("Receber o diagn��stico de HIV e aceitar um tratamento para a vida toda �� doloroso para qualquer pessoa. Os pacientes com HIV s��o mais suscet��veis a depress��o, ansiedade e outros problemas cognitivos, devido aos aspectos psicossociais relacionados a doen��a, como a discrimina����o, perda da autoestima, falta de apoio da fam��lia e social, o medo da morte e tamb��m o medo dos efeitos colaterais dos medicamentos, esses fatores podem levar a um quadro de depress��o intensa.Logo, o diagn��stico precoce e o tratamento da depress��o �� importante, de modo que o paciente consiga manter com a medica����o contra o infec����o do HIV e ter uma vida saud��vel.");
  }
  public boolean dispatchEvent(Component component, String componentName, String eventName, Object[] params){
    return false;
  }
}
package org.appinventor;
import com.google.appinventor.components.runtime.HandlesEventDispatching;
import com.google.appinventor.components.runtime.EventDispatcher;
import com.google.appinventor.components.runtime.Form;
import com.google.appinventor.components.runtime.Component;
import com.google.appinventor.components.runtime.Button;
import com.google.appinventor.components.runtime.HorizontalArrangement;
import com.google.appinventor.components.runtime.Label;
import com.google.appinventor.components.runtime.VerticalArrangement;
class depressaoeidade extends Form implements HandlesEventDispatching {
  private Button Button1;
  private HorizontalArrangement HorizontalArrangement1;
  private HorizontalArrangement HorizontalArrangement2;
  private Label Label1;
  private VerticalArrangement VerticalArrangement1;
  private Button Button2;
  private Button Button3;
  private Button Button4;
  protected void $define() {
    this.AppName("HourOfCode");
    this.Title("depressaoeidade");
    Button1 = new Button(this);
    Button1.BackgroundColor(0xEF5D79DE);
    Button1.Text("Voltar");
    Button1.TextColor(0xFFFFFFFF);
    HorizontalArrangement1 = new HorizontalArrangement(this);
    HorizontalArrangement1.Height(-1002);
    HorizontalArrangement2 = new HorizontalArrangement(this);
    HorizontalArrangement2.AlignHorizontal(3);
    HorizontalArrangement2.AlignVertical(2);
    HorizontalArrangement2.BackgroundColor(0xEF5D79DE);
    HorizontalArrangement2.Height(-1010);
    HorizontalArrangement2.Width(LENGTH_FILL_PARENT);
    Label1 = new Label(HorizontalArrangement2);
    Label1.FontBold(true);
    Label1.FontSize(20);
    Label1.Text("Depress��o e idade");
    Label1.TextColor(0xFFFFFFFF);
    VerticalArrangement1 = new VerticalArrangement(this);
    VerticalArrangement1.AlignHorizontal(3);
    VerticalArrangement1.AlignVertical(2);
    VerticalArrangement1.BackgroundColor(0x00FFFFFF);
    VerticalArrangement1.Height(-1040);
    VerticalArrangement1.Width(LENGTH_FILL_PARENT);
    Button2 = new Button(VerticalArrangement1);
    Button2.BackgroundColor(0xEF5D79DE);
    Button2.Width(-1060);
    Button2.Text("Depress��o Infantil");
    Button2.TextColor(0xFFFFFFFF);
    Button3 = new Button(VerticalArrangement1);
    Button3.BackgroundColor(0xEF5D79DE);
    Button3.Width(-1060);
    Button3.Text("Depress��o em Adolecentes");
    Button3.TextColor(0xFFFFFFFF);
    Button4 = new Button(VerticalArrangement1);
    Button4.BackgroundColor(0xEF5D79DE);
Button4.Width(-1060);
    Button4.Text("Depress��o em idosos");
    Button4.TextColor(0xFFFFFFFF);
  }
  public boolean dispatchEvent(Component component, String componentName, String eventName, Object[] params){
    return false;
  }
}
package org.appinventor;
import com.google.appinventor.components.runtime.HandlesEventDispatching;
import com.google.appinventor.components.runtime.EventDispatcher;
import com.google.appinventor.components.runtime.Form;
import com.google.appinventor.components.runtime.Component;
import com.google.appinventor.components.runtime.Button;
import com.google.appinventor.components.runtime.HorizontalArrangement;
import com.google.appinventor.components.runtime.Label;
import com.google.appinventor.components.runtime.VerticalArrangement;
class depressaoeidadecerta extends Form implements HandlesEventDispatching {
  private Button voltarpara4;
  private HorizontalArrangement HorizontalArrangement1;
  private HorizontalArrangement HorizontalArrangement2;
  private Label Label1;
  private VerticalArrangement VerticalArrangement1;
  private Button Button1;
  private Button Button2;
  private Button Button3;
  protected void $define() {
    this.AppName("HourOfCode");
    this.Title("depressaoeidadecerta");
    voltarpara4 = new Button(this);
    voltarpara4.BackgroundColor(0xEF5D79DE);
    voltarpara4.Text("Voltar");
    voltarpara4.TextColor(0xFFFFFFFF);
    HorizontalArrangement1 = new HorizontalArrangement(this);
    HorizontalArrangement1.Height(-1002);
    HorizontalArrangement2 = new HorizontalArrangement(this);
    HorizontalArrangement2.AlignHorizontal(3);
    HorizontalArrangement2.AlignVertical(2);
    HorizontalArrangement2.Height(-1010);
    HorizontalArrangement2.Width(LENGTH_FILL_PARENT);
    Label1 = new Label(HorizontalArrangement2);
    Label1.BackgroundColor(0xEF5D79DE);
    Label1.FontBold(true);
    Label1.FontSize(20);
    Label1.Height(LENGTH_FILL_PARENT);
    Label1.Width(LENGTH_FILL_PARENT);
    Label1.Text("Depress��o e idade");
    Label1.TextColor(0xFFFFFFFF);
    VerticalArrangement1 = new VerticalArrangement(this);
    VerticalArrangement1.AlignHorizontal(3);
    VerticalArrangement1.BackgroundColor(0x00FFFFFF);
    VerticalArrangement1.Height(LENGTH_FILL_PARENT);
    VerticalArrangement1.Width(LENGTH_FILL_PARENT);
    Button1 = new Button(VerticalArrangement1);
    Button1.BackgroundColor(0xEF5D79DE);
    Button1.Width(-1060);
    Button1.Text("Depress��o Infantil");
    Button1.TextColor(0xFFFFFFFF);
    Button2 = new Button(VerticalArrangement1);
    Button2.BackgroundColor(0xEF5D79DE);
    Button2.Width(-1060);
    Button2.Text("Depress��o em Adolescentes");
    Button2.TextColor(0xFFFFFFFF);
    Button3 = new Button(VerticalArrangement1);
    Button3.BackgroundColor(0xEF5D79DE);
    Button3.Width(-1060);
    Button3.Text("Depress��o em Idosos");
    Button3.TextColor(0xFFFFFFFF);
  }
  public boolean dispatchEvent(Component component, String componentName, String eventName, Object[] params){
    return false;
  }
}
package org.appinventor;
import com.google.appinventor.components.runtime.HandlesEventDispatching;
import com.google.appinventor.components.runtime.EventDispatcher;
import com.google.appinventor.components.runtime.Form;
import com.google.appinventor.components.runtime.Component;
import com.google.appinventor.components.runtime.Button;
import com.google.appinventor.components.runtime.HorizontalArrangement;
import com.google.appinventor.components.runtime.Label;
import com.google.appinventor.components.runtime.VerticalArrangement;
class depressaoeobesidade extends Form implements HandlesEventDispatching {
  private Button Button1;
  private HorizontalArrangement HorizontalArrangement1;
  private HorizontalArrangement HorizontalArrangement2;
  private Label Label1;
  private VerticalArrangement VerticalArrangement1;
  private Label Label2;
  protected void $define() {
    this.AppName("HourOfCode");
    this.Title("depressaoeobesidade");
    Button1 = new Button(this);
    Button1.BackgroundColor(0xEF5D79DE);
    Button1.Text("Voltar");
    Button1.TextColor(0xFFFFFFFF);
    HorizontalArrangement1 = new HorizontalArrangement(this);
    HorizontalArrangement1.Height(-1002);
    HorizontalArrangement2 = new HorizontalArrangement(this);
    HorizontalArrangement2.AlignHorizontal(3);
    HorizontalArrangement2.AlignVertical(2);
    HorizontalArrangement2.BackgroundColor(0xEF5D79DE);
    HorizontalArrangement2.Height(-1010);
    HorizontalArrangement2.Width(LENGTH_FILL_PARENT);
    Label1 = new Label(HorizontalArrangement2);
    Label1.FontBold(true);
    Label1.FontSize(20);
    Label1.Text("Depress��o e obesidade");
    Label1.TextColor(0xFFFFFFFF);
    VerticalArrangement1 = new VerticalArrangement(this);
    VerticalArrangement1.AlignHorizontal(3);
    VerticalArrangement1.AlignVertical(2);
    VerticalArrangement1.BackgroundColor(0xFFCCCCCC);
    VerticalArrangement1.Height(-1060);
    VerticalArrangement1.Width(LENGTH_FILL_PARENT);
    Label2 = new Label(VerticalArrangement1);
    Label2.FontBold(true);
    Label2.FontSize(17);
    Label2.Height(LENGTH_FILL_PARENT);
    Label2.Width(LENGTH_FILL_PARENT);
    Label2.Text("A aceita����o da imagem corporal �� um reflexo de aspectos biol��gicos, psicol��gicos, culturais e sociais. A pessoa deprimida geralmente se apresenta menos animada para se exercitar, incapaz de seguir com uma dieta saud��vel, recorrendo aos alimentos r��pidos, como fast-food e alimentos industrializados, prejudicando ainda mais a sua sa��de. Logo o tratamento psicol��gico e/ou medicamentoso para depress��o, poder�� auxiliar tanto a sua sa��de f��sica quanto a mental de uma pessoa acima do peso.");
  }
  public boolean dispatchEvent(Component component, String componentName, String eventName, Object[] params){
    return false;
  }
}
package org.appinventor;
import com.google.appinventor.components.runtime.HandlesEventDispatching;
import com.google.appinventor.components.runtime.EventDispatcher;
import com.google.appinventor.components.runtime.Form;
import com.google.appinventor.components.runtime.Component;
import com.google.appinventor.components.runtime.Button;
import com.google.appinventor.components.runtime.HorizontalArrangement;
import com.google.appinventor.components.runtime.Label;
import com.google.appinventor.components.runtime.VerticalArrangement;
class depressaoeoutrostranstornospsico extends Form implements HandlesEventDispatching {
  private Button Button1;
  private HorizontalArrangement HorizontalArrangement1;
  private HorizontalArrangement HorizontalArrangement2;
  private Label Label1;
  private VerticalArrangement VerticalArrangement1;
  private Label Label2;
  protected void $define() {
    this.AppName("HourOfCode");
    this.Title("depressaoeoutrostranstornospsico");
    Button1 = new Button(this);
    Button1.BackgroundColor(0xEF5D79DE);
    Button1.Text("Voltar");
    Button1.TextColor(0xFFFFFFFF);
    HorizontalArrangement1 = new HorizontalArrangement(this);
    HorizontalArrangement1.Height(-1002);
    HorizontalArrangement2 = new HorizontalArrangement(this);
    HorizontalArrangement2.AlignHorizontal(3);
    HorizontalArrangement2.AlignVertical(2);
    HorizontalArrangement2.BackgroundColor(0xEF5D79DE);
    HorizontalArrangement2.Height(-1010);
    HorizontalArrangement2.Width(LENGTH_FILL_PARENT);
    Label1 = new Label(HorizontalArrangement2);
    Label1.FontBold(true);
    Label1.FontSize(16);
    Label1.Text("Depress��o e outros Transtornos Psicol��gicos");
    Label1.TextColor(0xFFFFFFFF);
    VerticalArrangement1 = new VerticalArrangement(this);
    VerticalArrangement1.AlignHorizontal(3);
    VerticalArrangement1.AlignVertical(2);
    VerticalArrangement1.BackgroundColor(0xFFCCCCCC);
    VerticalArrangement1.Height(-1055);
    VerticalArrangement1.Width(LENGTH_FILL_PARENT);
    Label2 = new Label(VerticalArrangement1);
    Label2.FontBold(true);
    Label2.FontSize(17);
    Label2.Height(LENGTH_FILL_PARENT);
    Label2.Width(LENGTH_FILL_PARENT);
    Label2.Text("Muitos transtornos mentais podem facilitar que uma pessoa desenvolva depress��o. Como transtornos de ansiedade, alcoolismo, uso de drogas e esquizofrenia, enquanto os pacientes com fobia social e s��ndrome de p��nico, devido ��s limita����es das intera����es sociais acarretam um alto risco da pessoa desenvolver depress��o. Portanto, se uma pessoa apresenta algum outro transtorno psicol��gico, deve- se atentar aos sintomas de depress��o, para conseguir um tratamento espec��fico e eficaz.  ");
  }
  public boolean dispatchEvent(Component component, String componentName, String eventName, Object[] params){
    return false;
  }
}
package org.appinventor;
import com.google.appinventor.components.runtime.HandlesEventDispatching;
import com.google.appinventor.components.runtime.EventDispatcher;
import com.google.appinventor.components.runtime.Form;
import com.google.appinventor.components.runtime.Component;
import com.google.appinventor.components.runtime.Button;
import com.google.appinventor.components.runtime.HorizontalArrangement;
import com.google.appinventor.components.runtime.Label;
class depressaoesuicidio extends Form implements HandlesEventDispatching {
  private Button Button1;
  private HorizontalArrangement HorizontalArrangement1;
  private HorizontalArrangement HorizontalArrangement2;
  private Label Label1;
  private HorizontalArrangement HorizontalArrangement4;
  private HorizontalArrangement HorizontalArrangement3;
  private Label Label2;
  protected void $define() {
    this.AppName("HourOfCode");
    this.Title("depressaoesuicidio");
    Button1 = new Button(this);
    Button1.BackgroundColor(0xEF5D79DE);
    Button1.Text("Voltar");
    Button1.TextColor(0xFFFFFFFF);
    HorizontalArrangement1 = new HorizontalArrangement(this);
    HorizontalArrangement1.Height(-1002);
    HorizontalArrangement1.Width(LENGTH_FILL_PARENT);
    HorizontalArrangement2 = new HorizontalArrangement(this);
    HorizontalArrangement2.AlignHorizontal(3);
    HorizontalArrangement2.AlignVertical(2);
    HorizontalArrangement2.BackgroundColor(0xEF5D79DE);
    HorizontalArrangement2.Height(-1010);
    HorizontalArrangement2.Width(LENGTH_FILL_PARENT);
    Label1 = new Label(HorizontalArrangement2);
    Label1.FontSize(20);
    Label1.Text("Depress��o e su��cidio");
    Label1.TextColor(0xFFFFFFFF);
    HorizontalArrangement4 = new HorizontalArrangement(this);
    HorizontalArrangement4.Height(-1002);
    HorizontalArrangement4.Width(LENGTH_FILL_PARENT);
    HorizontalArrangement3 = new HorizontalArrangement(this);
    HorizontalArrangement3.BackgroundColor(0xFFCCCCCC);
    HorizontalArrangement3.Height(LENGTH_FILL_PARENT);
    HorizontalArrangement3.Width(LENGTH_FILL_PARENT);
    Label2 = new Label(HorizontalArrangement3);
    Label2.FontBold(true);
    Label2.FontSize(17);
    Label2.Height(LENGTH_FILL_PARENT);
    Label2.Width(LENGTH_FILL_PARENT);
    Label2.Text("Os pensamentos de morte e atitudes autodestrutivas s��o os sintomas mais perigosos da depress��o. O suic��dio torna-se atrativo para as pessoas deprimidas devido ao fato que parece uma maneira de acabar com o seu sofrimento. Tal convic����o �� extremamente equivocada e perigosa, sendo necess��rio um cuidado extra com este tipo de paciente. Para auxiliar na preven����o de suic��dio, h�� no Brasil a ONG Centro de Valoriza����o da Vida (CVV), onde a pessoa que est�� pensando em suic��dio poder�� entrar em contato com eles atrav��s do telefone 188 ou atrav��s do site www.cvv.org.br.");
  }
  public boolean dispatchEvent(Component component, String componentName, String eventName, Object[] params){
    return false;
  }
}
package org.appinventor;
import com.google.appinventor.components.runtime.HandlesEventDispatching;
import com.google.appinventor.components.runtime.EventDispatcher;
import com.google.appinventor.components.runtime.Form;
import com.google.appinventor.components.runtime.Component;
import com.google.appinventor.components.runtime.Button;
import com.google.appinventor.components.runtime.HorizontalArrangement;
import com.google.appinventor.components.runtime.Label;
import com.google.appinventor.components.runtime.VerticalArrangement;
class exercicios extends Form implements HandlesEventDispatching {
  private Button Button1;
  private HorizontalArrangement HorizontalArrangement1;
  private HorizontalArrangement HorizontalArrangement2;
  private Label Label1;
  private VerticalArrangement VerticalArrangement1;
  private Label Label2;
  protected void $define() {
    this.AppName("HourOfCode");
    this.Title("exercicios");
    Button1 = new Button(this);
    Button1.BackgroundColor(0xEF5D79DE);
    Button1.Text("Voltar");
    Button1.TextColor(0xFFFFFFFF);
    HorizontalArrangement1 = new HorizontalArrangement(this);
    HorizontalArrangement1.Height(-1002);
    HorizontalArrangement2 = new HorizontalArrangement(this);
    HorizontalArrangement2.AlignHorizontal(3);
    HorizontalArrangement2.AlignVertical(2);
    HorizontalArrangement2.BackgroundColor(0xEF5D79DE);
    HorizontalArrangement2.Height(-1010);
    HorizontalArrangement2.Width(LENGTH_FILL_PARENT);
    Label1 = new Label(HorizontalArrangement2);
    Label1.FontSize(20);
    Label1.Text("Exerc��cios F��sicos");
    Label1.TextColor(0xFFFFFFFF);
    VerticalArrangement1 = new VerticalArrangement(this);
    VerticalArrangement1.AlignHorizontal(3);
    VerticalArrangement1.AlignVertical(2);
    VerticalArrangement1.BackgroundColor(0xFFCCCCCC);
    VerticalArrangement1.Height(-1025);
    VerticalArrangement1.Width(LENGTH_FILL_PARENT);
    Label2 = new Label(VerticalArrangement1);
    Label2.FontBold(true);
    Label2.FontSize(17);
    Label2.Height(LENGTH_FILL_PARENT);
    Label2.Width(LENGTH_FILL_PARENT);
    Label2.Text("Com a pr��tica constante de exerc��cios f��sicos, ocorre a libera����o de endorfinas, neurotransmissores que assim como as serotoninas, propiciam uma sensa����o de bem-estar ao praticante.  ");
  }
  public boolean dispatchEvent(Component component, String componentName, String eventName, Object[] params){
    return false;
  }
}
package org.appinventor;
import com.google.appinventor.components.runtime.HandlesEventDispatching;
import com.google.appinventor.components.runtime.EventDispatcher;
import com.google.appinventor.components.runtime.Form;
import com.google.appinventor.components.runtime.Component;
import com.google.appinventor.components.runtime.Button;
import com.google.appinventor.components.runtime.HorizontalArrangement;
import com.google.appinventor.components.runtime.Label;
import com.google.appinventor.components.runtime.VerticalArrangement;
class fitoterapia extends Form implements HandlesEventDispatching {
  private Button Button1;
  private HorizontalArrangement HorizontalArrangement1;
  private HorizontalArrangement HorizontalArrangement2;
  private Label Label1;
  private VerticalArrangement VerticalArrangement1;
  private Label Label2;
  protected void $define() {
    this.AppName("HourOfCode");
    this.Title("Homeopatia");
    Button1 = new Button(this);
    Button1.BackgroundColor(0xEF5D79DE);
    Button1.Text("Voltar");
    Button1.TextColor(0xFFFFFFFF);
    HorizontalArrangement1 = new HorizontalArrangement(this);
    HorizontalArrangement1.Height(-1002);
    HorizontalArrangement2 = new HorizontalArrangement(this);
    HorizontalArrangement2.AlignHorizontal(3);
    HorizontalArrangement2.AlignVertical(2);
    HorizontalArrangement2.BackgroundColor(0xEF5D79DE);
    HorizontalArrangement2.Height(-1010);
    HorizontalArrangement2.Width(LENGTH_FILL_PARENT);
    Label1 = new Label(HorizontalArrangement2);
    Label1.FontSize(20);
    Label1.Text("Fitoterapia");
    Label1.TextColor(0xFFFFFFFF);
    VerticalArrangement1 = new VerticalArrangement(this);
    VerticalArrangement1.BackgroundColor(0xFFCCCCCC);
    VerticalArrangement1.Height(-1020);
    VerticalArrangement1.Width(LENGTH_FILL_PARENT);
    Label2 = new Label(VerticalArrangement1);
    Label2.FontBold(true);
    Label2.FontSize(17);
    Label2.Height(LENGTH_FILL_PARENT);
    Label2.Width(LENGTH_FILL_PARENT);
    Label2.Text("Baseia-se na utiliza����o do princ��pio-ativo de  plantas, por meio de ch��s, pomadas, extratos.");
  }
  public boolean dispatchEvent(Component component, String componentName, String eventName, Object[] params){
    return false;
  }
}
package org.appinventor;
import com.google.appinventor.components.runtime.HandlesEventDispatching;
import com.google.appinventor.components.runtime.EventDispatcher;
import com.google.appinventor.components.runtime.Form;
import com.google.appinventor.components.runtime.Component;
import com.google.appinventor.components.runtime.Button;
import com.google.appinventor.components.runtime.HorizontalArrangement;
import com.google.appinventor.components.runtime.Label;
class oqueedep extends Form implements HandlesEventDispatching {
  private Button voltar41;
  private HorizontalArrangement HorizontalArrangement1;
  private Label Label1;
  private HorizontalArrangement HorizontalArrangement3;
  private HorizontalArrangement HorizontalArrangement2;
  private Label Label2;
  protected void $define() {
    this.AppName("HourOfCode");
    this.Title("oqueedep");
    voltar41 = new Button(this);
    voltar41.BackgroundColor(0xEF5D79DE);
    voltar41.Text("Voltar");
    voltar41.TextColor(0xFFFFFFFF);
    HorizontalArrangement1 = new HorizontalArrangement(this);
    HorizontalArrangement1.AlignHorizontal(3);
    HorizontalArrangement1.AlignVertical(2);
    HorizontalArrangement1.BackgroundColor(0xEF5D79DE);
    HorizontalArrangement1.Height(-1010);
    HorizontalArrangement1.Width(LENGTH_FILL_PARENT);
    Label1 = new Label(HorizontalArrangement1);
    Label1.FontBold(true);
    Label1.FontSize(20);
    Label1.Text("O que �� depress��o?");
    Label1.TextColor(0xFFFFFFFF);
    HorizontalArrangement3 = new HorizontalArrangement(this);
    HorizontalArrangement3.AlignVertical(2);
    HorizontalArrangement3.Height(-1010);
    HorizontalArrangement3.Width(LENGTH_FILL_PARENT);
    HorizontalArrangement2 = new HorizontalArrangement(this);
    HorizontalArrangement2.BackgroundColor(0xFFCCCCCC);
    HorizontalArrangement2.Height(-1050);
    HorizontalArrangement2.Width(LENGTH_FILL_PARENT);
    Label2 = new Label(HorizontalArrangement2);
    Label2.BackgroundColor(0xFFCCCCCC);
    Label2.FontBold(true);
    Label2.FontSize(17);
    Label2.Height(-1050);
    Label2.Width(LENGTH_FILL_PARENT);
    Label2.Text("A depress��o �� um transtorno de humor que se manifesta como uma doen��a cr��nica e recorrente. �� caracterizada por um sentimento de profunda tristeza, associada com sentimentos de dor, amargura, desesperan��a, baixa autoestima e culpa. Nas pessoas depressivas, nota-se tristeza constante e intensa mesmo sem motivo claro, que: Persiste por meses e anos; Afeta o desempenho das fun����es do dia a dia;  Acarreta a perda de interesse por atividades que antes proporcionavam prazer.");
  }
  public boolean dispatchEvent(Component component, String componentName, String eventName, Object[] params){
    return false;
  }
}
package org.appinventor;
import com.google.appinventor.components.runtime.HandlesEventDispatching;
import com.google.appinventor.components.runtime.EventDispatcher;
import com.google.appinventor.components.runtime.Form;
import com.google.appinventor.components.runtime.Component;
import com.google.appinventor.components.runtime.Button;
import com.google.appinventor.components.runtime.HorizontalArrangement;
import com.google.appinventor.components.runtime.Label;
class terapiamedicamentosa extends Form implements HandlesEventDispatching {
  private Button Button1;
  private HorizontalArrangement HorizontalArrangement1;
  private HorizontalArrangement HorizontalArrangement3;
  private Label Label2;
  private HorizontalArrangement HorizontalArrangement2;
  private Label Label1;
  private HorizontalArrangement HorizontalArrangement5;
  private HorizontalArrangement HorizontalArrangement4;
  private Button Button2;
  protected void $define() {
    this.AppName("HourOfCode");
    this.Title("terapiamedicamentosa");
    Button1 = new Button(this);
    Button1.BackgroundColor(0xEF5D79DE);
    Button1.Text("Voltar");
    Button1.TextColor(0xFFFFFFFF);
    HorizontalArrangement1 = new HorizontalArrangement(this);
    HorizontalArrangement1.Height(-1002);
    HorizontalArrangement1.Width(LENGTH_FILL_PARENT);
    HorizontalArrangement3 = new HorizontalArrangement(this);
    HorizontalArrangement3.AlignHorizontal(3);
    HorizontalArrangement3.BackgroundColor(0xEF5D79DE);
    HorizontalArrangement3.Height(-1010);
    HorizontalArrangement3.Width(LENGTH_FILL_PARENT);
    Label2 = new Label(HorizontalArrangement3);
    Label2.FontSize(20);
    Label2.Text("Terapia Medicamentosa");
    Label2.TextColor(0xFFFFFFFF);
    HorizontalArrangement2 = new HorizontalArrangement(this);
    HorizontalArrangement2.BackgroundColor(0xFFCCCCCC);
    HorizontalArrangement2.Height(-1030);
    HorizontalArrangement2.Width(LENGTH_FILL_PARENT);
    Label1 = new Label(HorizontalArrangement2);
    Label1.FontBold(true);
    Label1.FontSize(17);
    Label1.Height(LENGTH_FILL_PARENT);
    Label1.Width(LENGTH_FILL_PARENT);
    Label1.Text("Em alguns casos, �� necess��ria a administra����o de f��rmacos espec��ficos, denominados antidepressivos. A prescri����o e dosagem deve ser  feita APENAS por profissional reconhecido, sendo extremamente importante evitar a auto-medica����o. ");
    HorizontalArrangement5 = new HorizontalArrangement(this);
    HorizontalArrangement5.Height(-1010);
    HorizontalArrangement5.Width(LENGTH_FILL_PARENT);
    HorizontalArrangement4 = new HorizontalArrangement(this);
    HorizontalArrangement4.AlignHorizontal(3);
    HorizontalArrangement4.AlignVertical(2);
    HorizontalArrangement4.Height(LENGTH_FILL_PARENT);
    HorizontalArrangement4.Width(LENGTH_FILL_PARENT);
    Button2 = new Button(HorizontalArrangement4);
    Button2.BackgroundColor(0xEF5D79DE);
    Button2.Enabled(false);
    Button2.FontBold(true);
    Button2.FontSize(17);
    Button2.Text(" Classes de rem��dios mais utilizados");
    Button2.TextColor(0xFFFFFFFF);
  }
  public boolean dispatchEvent(Component component, String componentName, String eventName, Object[] params){
    return false;
  }
}
package org.appinventor;
import com.google.appinventor.components.runtime.HandlesEventDispatching;
import com.google.appinventor.components.runtime.EventDispatcher;
import com.google.appinventor.components.runtime.Form;
import com.google.appinventor.components.runtime.Component;
import com.google.appinventor.components.runtime.Button;
import com.google.appinventor.components.runtime.HorizontalArrangement;
import com.google.appinventor.components.runtime.Label;
import com.google.appinventor.components.runtime.VerticalArrangement;
class tratamento extends Form implements HandlesEventDispatching {
  private Button voltar42;
  private HorizontalArrangement HorizontalArrangement1;
  private Label Label1;
  private VerticalArrangement VerticalArrangement1;
  private Button terapiamedicamentosa;
  private Button psicoterapia;
  private Button complementares;
  private HorizontalArrangement HorizontalArrangement2;
  protected void $define() {
    this.AppName("HourOfCode");
    this.Title("tratamento");
    voltar42 = new Button(this);
    voltar42.BackgroundColor(0xEF5D79DE);
    voltar42.Text("Voltar");
    voltar42.TextColor(0xFFFFFFFF);
    HorizontalArrangement1 = new HorizontalArrangement(this);
    HorizontalArrangement1.AlignHorizontal(3);
    HorizontalArrangement1.AlignVertical(2);
    HorizontalArrangement1.BackgroundColor(0xEF5D79DE);
    HorizontalArrangement1.Height(-1010);
    HorizontalArrangement1.Width(LENGTH_FILL_PARENT);
    Label1 = new Label(HorizontalArrangement1);
    Label1.FontBold(true);
    Label1.FontSize(20);
    Label1.Text("Tratamentos");
    Label1.TextColor(0xFFFFFFFF);
    VerticalArrangement1 = new VerticalArrangement(this);
    VerticalArrangement1.AlignHorizontal(3);
    VerticalArrangement1.AlignVertical(2);
    VerticalArrangement1.BackgroundColor(0x00FFFFFF);
    VerticalArrangement1.Height(-1040);
    VerticalArrangement1.Width(LENGTH_FILL_PARENT);
    terapiamedicamentosa = new Button(VerticalArrangement1);
    terapiamedicamentosa.BackgroundColor(0xEF5D79DE);
    terapiamedicamentosa.Width(-1060);
    terapiamedicamentosa.Text("Terapia medicamentosa");
    terapiamedicamentosa.TextColor(0xFFFFFFFF);
    psicoterapia = new Button(VerticalArrangement1);
    psicoterapia.BackgroundColor(0xEF5D79DE);
    psicoterapia.Width(-1060);
    psicoterapia.Text("Psicoterapia");
    psicoterapia.TextColor(0xFFFFFFFF);
    complementares = new Button(VerticalArrangement1);
    complementares.BackgroundColor(0xEF5D79DE);
    complementares.Width(-1060);
    complementares.Text("Terapias Complementares");
    complementares.TextColor(0xFFFFFFFF);
    HorizontalArrangement2 = new HorizontalArrangement(this);
    HorizontalArrangement2.Height(LENGTH_FILL_PARENT);
    HorizontalArrangement2.Width(LENGTH_FILL_PARENT);
  }
  public boolean dispatchEvent(Component component, String componentName, String eventName, Object[] params){
    return false;
  }
}
package org.appinventor;
import com.google.appinventor.components.runtime.HandlesEventDispatching;
import com.google.appinventor.components.runtime.EventDispatcher;
import com.google.appinventor.components.runtime.Form;
import com.google.appinventor.components.runtime.Component;
import com.google.appinventor.components.runtime.Button;
import com.google.appinventor.components.runtime.HorizontalArrangement;
import com.google.appinventor.components.runtime.Label;
import com.google.appinventor.components.runtime.VerticalArrangement;
class vermais extends Form implements HandlesEventDispatching {
  private Button Button1;
  private HorizontalArrangement HorizontalArrangement1;
  private HorizontalArrangement HorizontalArrangement2;
  private Label Label1;
  private VerticalArrangement VerticalArrangement1;
  private Button Button5;
  private Button Button4;
  private Button Button3;
  private Button Button2;
  protected void $define() {
    this.AppName("HourOfCode");
    this.Title("vermais");
    Button1 = new Button(this);
    Button1.BackgroundColor(0xEF5D79DE);
    Button1.Text("Voltar");
    Button1.TextColor(0xFFFFFFFF);
    HorizontalArrangement1 = new HorizontalArrangement(this);
    HorizontalArrangement1.Height(-1002);
    HorizontalArrangement2 = new HorizontalArrangement(this);
    HorizontalArrangement2.AlignHorizontal(3);
    HorizontalArrangement2.AlignVertical(2);
    HorizontalArrangement2.BackgroundColor(0xEF5D79DE);
    HorizontalArrangement2.Height(-1010);
    HorizontalArrangement2.Width(LENGTH_FILL_PARENT);
    Label1 = new Label(HorizontalArrangement2);
    Label1.FontBold(true);
    Label1.FontSize(20);
    Label1.Text("Depress��o e Comorbidade");
    Label1.TextColor(0xFFFFFFFF);
    VerticalArrangement1 = new VerticalArrangement(this);
    VerticalArrangement1.AlignHorizontal(3);
    VerticalArrangement1.AlignVertical(2);
    VerticalArrangement1.BackgroundColor(0x00FFFFFF);
    VerticalArrangement1.Height(-1050);
    VerticalArrangement1.Width(LENGTH_FILL_PARENT);
    Button5 = new Button(VerticalArrangement1);
    Button5.BackgroundColor(0xEF5D79DE);
    Button5.FontBold(true);
    Button5.Width(-1080);
    Button5.Text("Depress��o e c��ncer");
    Button5.TextColor(0xFFFFFFFF);
    Button4 = new Button(VerticalArrangement1);
    Button4.BackgroundColor(0xEF5D79DE);
    Button4.FontBold(true);
    Button4.Width(-1080);
    Button4.Text("Depress��o e obesidade");
    Button4.TextColor(0xFFFFFFFF);
    Button3 = new Button(VerticalArrangement1);
    Button3.BackgroundColor(0xEF5D79DE);
    Button3.FontBold(true);
    Button3.FontSize(13);
    Button3.Width(-1080);
    Button3.Text("Depress��o e outros transtornos psicol��gicos");
    Button3.TextColor(0xFFFFFFFF);
    Button2 = new Button(VerticalArrangement1);
    Button2.BackgroundColor(0xEF5D79DE);
    Button2.FontBold(true);
    Button2.Width(-1080);
    Button2.Text("Depress��o e HIV");
    Button2.TextColor(0xFFFFFFFF);
  }
  public boolean dispatchEvent(Component component, String componentName, String eventName, Object[] params){
    return false;
  }
}
package org.appinventor;
import com.google.appinventor.components.runtime.HandlesEventDispatching;
import com.google.appinventor.components.runtime.EventDispatcher;
import com.google.appinventor.components.runtime.Form;
import com.google.appinventor.components.runtime.Component;
import com.google.appinventor.components.runtime.Button;
import com.google.appinventor.components.runtime.HorizontalArrangement;
import com.google.appinventor.components.runtime.VerticalArrangement;
import com.google.appinventor.components.runtime.Label;
class yoga extends Form implements HandlesEventDispatching {
  private Button Button1;
  private HorizontalArrangement HorizontalArrangement1;
  private VerticalArrangement VerticalArrangement1;
  private Label Label1;
  private VerticalArrangement VerticalArrangement2;
  private Label Label2;
  protected void $define() {
    this.AppName("HourOfCode");
    this.Title("yoga");
    Button1 = new Button(this);
    Button1.BackgroundColor(0xEF5D79DE);
    Button1.Text("Voltar");
    Button1.TextColor(0xFFFFFFFF);
    HorizontalArrangement1 = new HorizontalArrangement(this);
    HorizontalArrangement1.Height(-1002);
    VerticalArrangement1 = new VerticalArrangement(this);
    VerticalArrangement1.AlignHorizontal(3);
    VerticalArrangement1.AlignVertical(2);
    VerticalArrangement1.BackgroundColor(0xEF5D79DE);
    VerticalArrangement1.Height(-1010);
    VerticalArrangement1.Width(LENGTH_FILL_PARENT);
    Label1 = new Label(VerticalArrangement1);
    Label1.FontSize(20);
    Label1.Text(" Yoga");
    Label1.TextColor(0xFFFFFFFF);
    VerticalArrangement2 = new VerticalArrangement(this);
    VerticalArrangement2.BackgroundColor(0xFFCCCCCC);
    VerticalArrangement2.Height(-1020);
    VerticalArrangement2.Width(LENGTH_FILL_PARENT);
    Label2 = new Label(VerticalArrangement2);
    Label2.FontBold(true);
    Label2.FontSize(17);
    Label2.Height(LENGTH_FILL_PARENT);
    Label2.Width(LENGTH_FILL_PARENT);
    Label2.Text("A tecnica de yoga, busca despertar a sensa����o de bem-estar por meio de t��cnicas de respira����o, posturas e movimentos f��sicos.");
  }
  public boolean dispatchEvent(Component component, String componentName, String eventName, Object[] params){
    return false;
  }
}
