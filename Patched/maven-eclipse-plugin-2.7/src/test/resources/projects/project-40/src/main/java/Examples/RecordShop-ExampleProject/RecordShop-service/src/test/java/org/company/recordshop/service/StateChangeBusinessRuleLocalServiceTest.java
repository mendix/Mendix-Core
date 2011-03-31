package org.company.recordshop.service;

import org.company.recordshop.service.dto.CasusOverlegDto;
import org.company.recordshop.service.dto.KaderDto;
import org.company.recordshop.service.dto.OrganisatieDto;
import org.company.recordshop.service.local.StateChangeBusinessRuleLocalService;
import org.joda.time.DateTime;
import org.junit.Before;
import org.junit.Test;
import org.mendix.runtime.exception.BusinessRuleException;
import org.springframework.beans.factory.annotation.Autowired;

public class StateChangeBusinessRuleLocalServiceTest extends AbstractServiceTestCase {

    @Autowired
    private StateChangeBusinessRuleLocalService stateChangeBusinessRuleLocalService;

    private KaderDto kader;

    private OrganisatieDto ordina;

    @Before
    public void setUp() throws Exception {
        kader = new KaderDto();
        kader.setNaam("Een groot denkraam");
        kader = stateChangeBusinessRuleLocalService
                .readKaderAsKaderDto(stateChangeBusinessRuleLocalService.createKader(kader));

        ordina = new OrganisatieDto();
        ordina.setNaam("Ordina");
        ordina = stateChangeBusinessRuleLocalService
                .readOrganisatieAsOrganisatieDto(stateChangeBusinessRuleLocalService
                        .createOrganisatie(ordina));
        kader.addToOrganisaties(ordina);
        stateChangeBusinessRuleLocalService.updateKader(kader);
    }

    @Test
    public void testUpdateKaderOverlegGisteren() {
        removeOrganisatieMetCasusOverleg(new DateTime().minusDays(1));
    }

    @Test(expected = BusinessRuleException.class)
    public void testUpdateKaderOverlegStraks() {
        removeOrganisatieMetCasusOverleg(new DateTime().plusHours(1));
    }

    @Test(expected = BusinessRuleException.class)
    public void testUpdateKaderOverlegMorgen() {
        removeOrganisatieMetCasusOverleg(new DateTime().plusDays(1));
    }

    private void removeOrganisatieMetCasusOverleg(DateTime datum) {
        CasusOverlegDto overleg = new CasusOverlegDto();
        overleg.setNaam("overleg");
        overleg.setDatum(datum);
        overleg = stateChangeBusinessRuleLocalService
                .readCasusOverlegAsCasusOverlegDto(stateChangeBusinessRuleLocalService
                        .createCasusOverleg(overleg));

        ordina.addToOverleggen(overleg);
        stateChangeBusinessRuleLocalService.updateOrganisatie(ordina);
        flush();
        clear();
        kader = stateChangeBusinessRuleLocalService.readKaderAsKaderDto(kader.getId());
        kader.removeFromOrganisaties((OrganisatieDto) kader.getOrganisaties().toArray()[0]);
        stateChangeBusinessRuleLocalService.updateKader(kader);
    }
}
