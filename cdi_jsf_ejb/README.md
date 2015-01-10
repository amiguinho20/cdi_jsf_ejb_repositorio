cdi_jsf_ejb
===========

Microexemplo de como se integram: CDI, EJB, JSF e Primefaces.

O arquivo do maven "pom.xml" eh responsavel por organizar as dependencias. Lembrando
que o javaee-api possui CDI, EJB e JSF, sendo necessario apenas a dependencia 
adicional do Primefaces.

Observacoes:
- A classe POJO Utilitario existe apenas para demonstrar que ela usa/injeta instancias com o CDI e tambem
  eh usada/injetada pelo CDI;
- O CrudMB usa o Utilitario (somar), esse por sua vez usa o CrudEJB. Esse fluxo eh interligado pelo CDI;
- O CrudMB usa o CrudEJB (listar). Esse fluxo tambem eh interligado pelo CDI;
- O arquivo "beans.xml" sinaliza para o container que o CDI esta ligado/acionado;
- O arquivo "index.xhtml" eh o welcome-file, configurado no "web.xml", faz apenas o redirecionamento
  para a pagina "listar.xhtml";
- O arquivo "faces-config.xml" existe apenas para configurar o arquivo de labels dos campos,
  que eh o "messages_labels.properties".
      
