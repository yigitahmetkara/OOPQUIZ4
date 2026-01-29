Car Racing Simulation - OOP Case Study
Bu proje, Java programlama dili kullanılarak geliştirilmiş bir Yarış Simülasyonu uygulamasıdır. Projenin ana amacı; kalıtım (inheritance), kapsülleme (encapsulation) ve polimorfizm (çok biçimlilik) gibi Nesne Yönelimli Programlama (OOP) kavramlarını gerçekçi bir senaryo üzerinde uygulamaktır.

Proje Yapısı ve Sınıflar
Sistem, bir yarış organizasyonunun temel bileşenlerini modelleyen şu hiyerarşik yapıdan oluşmaktadır:

Araç Modelleri (Subclasses):

Ferrari.java, Bugatti.java, Porsche.java: Ana Car sınıfından türetilen, kendine has performans özelliklerine sahip spesifik araç sınıfları.

Yarış Yönetimi (Management):

RaceManager.java: Yarışın başlatılması, tur takibi ve kazananın belirlenmesi gibi lojistik süreçleri yönetir.

CarRace.java: Yarış pistini ve yarış kurallarını tanımlayan temel sınıftır.

Aktörler:

Driver.java: Araçları kullanan sürücülerin yetenek ve bilgilerini tutar.

Yardımcı Yapılar:

CommonOperations.java: Proje genelinde kullanılan ortak fonksiyonları (hesaplamalar, formatlamalar vb.) barındırır.

Temel Özellikler
Hiyerarşik Mimari: Tüm araçların ortak bir temel sınıftan (Car) miras alarak kod tekrarının önlenmesi.

Sürücü-Araç Etkileşimi: Sürücü yeteneklerinin araç performansı üzerindeki etkisinin modellenmesi.

Yarış Mantığı: Dinamik yarış süreçlerinin ve yönetimsel operasyonların RaceManager üzerinden yürütülmesi.

Teknik Detaylar
Dil: Java

IDE: Eclipse

Versiyon Kontrolü: Git & GitHub

Kurulum
Projeyi yerel makinenize klonlayın:

Bash
git clone https://github.com/yigitahmetkara/car-race-simulation.git
Eclipse IDE'sini açın.

File > Import > Existing Projects into Workspace adımlarını izleyerek projeyi dahil edin.

Ana test sınıfını çalıştırarak yarış simülasyonunu başlatın.
