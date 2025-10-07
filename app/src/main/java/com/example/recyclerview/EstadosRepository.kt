package com.example.recyclerview

object EstadosRepository {

    fun obterEstados(): List<Estado> {
        // Lista fixa com os dados básicos de cada estado brasileiro.
        return listOf(
            Estado(
                nome = "Acre",
                capital = "Rio Branco",
                populacao = "906.876 habitantes",
                regiao = "Norte",
                bandeiraResId = R.drawable.bandeira_ac
            ),
            Estado(
                nome = "Alagoas",
                capital = "Maceió",
                populacao = "3.351.543 habitantes",
                regiao = "Nordeste",
                bandeiraResId = R.drawable.bandeira_al
            ),
            Estado(
                nome = "Amapá",
                capital = "Macapá",
                populacao = "877.613 habitantes",
                regiao = "Norte",
                bandeiraResId = R.drawable.bandeira_ap
            ),
            Estado(
                nome = "Amazonas",
                capital = "Manaus",
                populacao = "4.269.995 habitantes",
                regiao = "Norte",
                bandeiraResId = R.drawable.bandeira_am
            ),
            Estado(
                nome = "Bahia",
                capital = "Salvador",
                populacao = "14.985.284 habitantes",
                regiao = "Nordeste",
                bandeiraResId = R.drawable.bandeira_ba
            ),
            Estado(
                nome = "Ceará",
                capital = "Fortaleza",
                populacao = "9.240.580 habitantes",
                regiao = "Nordeste",
                bandeiraResId = R.drawable.bandeira_ce
            ),
            Estado(
                nome = "Distrito Federal",
                capital = "Brasília",
                populacao = "3.094.325 habitantes",
                regiao = "Centro-Oeste",
                bandeiraResId = R.drawable.bandeira_df
            ),
            Estado(
                nome = "Espírito Santo",
                capital = "Vitória",
                populacao = "4.108.508 habitantes",
                regiao = "Sudeste",
                bandeiraResId = R.drawable.bandeira_es
            ),
            Estado(
                nome = "Goiás",
                capital = "Goiânia",
                populacao = "7.056.495 habitantes",
                regiao = "Centro-Oeste",
                bandeiraResId = R.drawable.bandeira_go
            ),
            Estado(
                nome = "Maranhão",
                capital = "São Luís",
                populacao = "7.153.262 habitantes",
                regiao = "Nordeste",
                bandeiraResId = R.drawable.bandeira_ma
            ),
            Estado(
                nome = "Mato Grosso",
                capital = "Cuiabá",
                populacao = "3.567.234 habitantes",
                regiao = "Centro-Oeste",
                bandeiraResId = R.drawable.bandeira_mt
            ),
            Estado(
                nome = "Mato Grosso do Sul",
                capital = "Campo Grande",
                populacao = "2.809.394 habitantes",
                regiao = "Centro-Oeste",
                bandeiraResId = R.drawable.bandeira_ms
            ),
            Estado(
                nome = "Minas Gerais",
                capital = "Belo Horizonte",
                populacao = "21.411.923 habitantes",
                regiao = "Sudeste",
                bandeiraResId = R.drawable.bandeira_mg
            ),
            Estado(
                nome = "Pará",
                capital = "Belém",
                populacao = "8.690.745 habitantes",
                regiao = "Norte",
                bandeiraResId = R.drawable.bandeira_pa
            ),
            Estado(
                nome = "Paraíba",
                capital = "João Pessoa",
                populacao = "4.018.127 habitantes",
                regiao = "Nordeste",
                bandeiraResId = R.drawable.bandeira_pb
            ),
            Estado(
                nome = "Paraná",
                capital = "Curitiba",
                populacao = "11.516.840 habitantes",
                regiao = "Sul",
                bandeiraResId = R.drawable.bandeira_pr
            ),
            Estado(
                nome = "Pernambuco",
                capital = "Recife",
                populacao = "9.674.793 habitantes",
                regiao = "Nordeste",
                bandeiraResId = R.drawable.bandeira_pe
            ),
            Estado(
                nome = "Piauí",
                capital = "Teresina",
                populacao = "3.289.290 habitantes",
                regiao = "Nordeste",
                bandeiraResId = R.drawable.bandeira_pi
            ),
            Estado(
                nome = "Rio de Janeiro",
                capital = "Rio de Janeiro",
                populacao = "17.366.189 habitantes",
                regiao = "Sudeste",
                bandeiraResId = R.drawable.bandeira_rj
            ),
            Estado(
                nome = "Rio Grande do Norte",
                capital = "Natal",
                populacao = "3.560.903 habitantes",
                regiao = "Nordeste",
                bandeiraResId = R.drawable.bandeira_rn
            ),
            Estado(
                nome = "Rio Grande do Sul",
                capital = "Porto Alegre",
                populacao = "11.466.630 habitantes",
                regiao = "Sul",
                bandeiraResId = R.drawable.bandeira_rs
            ),
            Estado(
                nome = "Rondônia",
                capital = "Porto Velho",
                populacao = "1.815.278 habitantes",
                regiao = "Norte",
                bandeiraResId = R.drawable.bandeira_ro
            ),
            Estado(
                nome = "Roraima",
                capital = "Boa Vista",
                populacao = "652.713 habitantes",
                regiao = "Norte",
                bandeiraResId = R.drawable.bandeira_rr
            ),
            Estado(
                nome = "Santa Catarina",
                capital = "Florianópolis",
                populacao = "7.338.473 habitantes",
                regiao = "Sul",
                bandeiraResId = R.drawable.bandeira_sc
            ),
            Estado(
                nome = "São Paulo",
                capital = "São Paulo",
                populacao = "44.420.459 habitantes",
                regiao = "Sudeste",
                bandeiraResId = R.drawable.bandeira_sp
            ),
            Estado(
                nome = "Sergipe",
                capital = "Aracaju",
                populacao = "2.318.822 habitantes",
                regiao = "Nordeste",
                bandeiraResId = R.drawable.bandeira_se
            ),
            Estado(
                nome = "Tocantins",
                capital = "Palmas",
                populacao = "1.607.363 habitantes",
                regiao = "Norte",
                bandeiraResId = R.drawable.bandeira_to
            )
        )
    }
}
