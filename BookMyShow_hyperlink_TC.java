����   4 �  demo/BookMyShow_hyperlink_TC  java/lang/Object <init> ()V Code
  	   LineNumberTable LocalVariableTable this Ldemo/BookMyShow_hyperlink_TC; main ([Ljava/lang/String;)V 
Exceptions  java/lang/InterruptedException
    )io/github/bonigarcia/wdm/WebDriverManager   chromedriver -()Lio/github/bonigarcia/wdm/WebDriverManager;
     setup  (org/openqa/selenium/chrome/ChromeOptions
  	   java/lang/String " --remote-allow-origins=*
  $ % & addArguments C([Ljava/lang/String;)Lorg/openqa/selenium/chromium/ChromiumOptions; ( 'org/openqa/selenium/chrome/ChromeDriver
 ' *  + -(Lorg/openqa/selenium/chrome/ChromeOptions;)V
 ' - . / manage )()Lorg/openqa/selenium/WebDriver$Options; 1 3 2 %org/openqa/selenium/WebDriver$Options 4 5 timeouts *()Lorg/openqa/selenium/WebDriver$Timeouts;       	 9 ; : java/util/concurrent/TimeUnit < = SECONDS Ljava/util/concurrent/TimeUnit; ? A @ &org/openqa/selenium/WebDriver$Timeouts B C implicitlyWait J(JLjava/util/concurrent/TimeUnit;)Lorg/openqa/selenium/WebDriver$Timeouts; E .https://in.bookmyshow.com/explore/home/chennai
 ' G H I get (Ljava/lang/String;)V K link
 M O N org/openqa/selenium/By P Q tagName ,(Ljava/lang/String;)Lorg/openqa/selenium/By;
 ' S T U findElements *(Lorg/openqa/selenium/By;)Ljava/util/List; W Y X java/util/List Z [ size ()I	 ] _ ^ java/lang/System ` a out Ljava/io/PrintStream; c java/lang/StringBuilder e +Total number of hyperlinks on the webpage: 
 b g  I
 b i j k append (I)Ljava/lang/StringBuilder;
 b m n o toString ()Ljava/lang/String;
 q s r java/io/PrintStream t I println
 ' v w  close args [Ljava/lang/String; driver )Lorg/openqa/selenium/chrome/ChromeDriver; options *Lorg/openqa/selenium/chrome/ChromeOptions; links Ljava/util/List; numberOfLinks I LocalVariableTypeTable 2Ljava/util/List<Lorg/openqa/selenium/WebElement;>; 
SourceFile BookMyShow_hyperlink_TC.java InnerClasses � org/openqa/selenium/WebDriver Options Timeouts !               /     *� �    
                    	             �     n� � � Y� M,� Y!S� #W� 'Y,� )L+� ,� 0  6� 8� > W+D� F+J� L� RN-� V 6� \� bYd� f� h� l� p+� u�    
   .           %  :   @ " J $ R & i ( m *    4    n x y   % I z {   ` | }  J $ ~   R  � �  �     J $ ~ �   �    � �     1 � �	 ? � �	