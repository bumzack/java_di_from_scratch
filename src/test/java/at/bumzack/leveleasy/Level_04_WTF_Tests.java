package at.bumzack.leveleasy;

import at.bumzack.di.DependencyInjectionService;
import at.bumzack.exception.AmbiguousBeanException;
import at.bumzack.exception.BeanNotFoundException;
import at.bumzack.exception.ClassCreationException;
import at.bumzack.levelwtf.RequestHandler;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

// BEFORE you begin
// estimation for implementation in hours:
// actual time spend for implementation in hours:

class Level_04_WTF_Tests {

    private final DependencyInjectionService dependencyInjectionService = DependencyInjectionService.getInstance();

    // ********************************************************************************
    // ********************************************************************************
    // level 04 - WTF
    // ********************************************************************************
    // ********************************************************************************
    @Test
    public void level04_brutal_01() throws BeanNotFoundException, AmbiguousBeanException, ClassCreationException {
        final RequestHandler requestHandler1 = (RequestHandler) dependencyInjectionService.beanByName("requestHandler");
        final RequestHandler requestHandler2 = (RequestHandler) dependencyInjectionService.beanByName("requestHandler");

        final var res1 = requestHandler1.handleRequest("bliblablupp", "nope");
        assertThat(res1).isTrue();

        final var res2 = requestHandler1.handleRequest("nope", "bliblablupp");
        assertThat(res2).isTrue();

        final var res3 = requestHandler1.handleRequest("nope", "other nope");
        assertThat(res3).isFalse();

        assertThat(requestHandler1).isNotEqualTo(requestHandler2);
        assertThat(requestHandler1.getAuthService()).isEqualTo(requestHandler2.getAuthService());
    }
}
