package servicos;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class ServicoCalculaAnos {
    public long calculaAnos(String dtContracao){
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        LocalDate data = LocalDate.parse(dtContracao + "-01", formatter);
        LocalDate agora = LocalDate.now();
        return ChronoUnit.YEARS.between(data, agora);

    }
}
