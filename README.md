# Selenium web driver
https://www.seleniumhq.org/projects/webdriver/

# Selenium Chrome driver download
https://sites.google.com/a/chromium.org/chromedriver/

### Jenkins server
#### Download jdk-8u181-linux-x64.rpm
> Go to https://www.oracle.com/technetwork/java/javase/downloads/jdk8-downloads-2133151.html

#### Install FTP software
> Go to https://filezilla-project.org/download.php?type=client

#### Copy jdk to /root/ folder to use FTP file transfer software

#### Login CENTOS7 server with teraterm

#### Install Java
$ rpm -ihv /root/jdk-8u181-linux-x64.rpm
Java version check
$ java -version

#### Install jenkins
$ curl -o /etc/yum.repos.d/jenkins.repo https://pkg.jenkins.io/redhat-stable/jenkins.repo
$ rpm --import https://pkg.jenkins.io/redhat-stable/jenkins.io.key
$ yum info jenkins
$ yum -y install jenkins

#### To enable Jenkins service
$ systemctl enable jenkins
> jenkins.service is not a native service, redirecting to /sbin/chkconfig.
> Executing /sbin/chkconfig jenkins on

#### Jenkins service to start
$ systemctl start jenkins

#### Firewall setting for default Jenkins port
$ cd /etc/firewalld/services/
$ cat > jenkins.xml
```
<?xml version="1.0" encoding="utf-8"?>
<service>
  <short>Jenkins</short>
  <description>Jenkins</description>
  <port protocol="tcp" port="8080"/>
</service>
```
$ firewall-cmd --list-services --zone=public --permanent
> ssh dhcpv6-client

$ firewall-cmd --add-service=jenkins --zone=public --permanent
> success

$ firewall-cmd --reload
> success

$ firewall-cmd --list-services --zone=public --permanent
> ssh dhcpv6-client jenkins

#### Jenkins URL
http://host:8080

### Selenium hub 
