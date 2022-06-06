package com.aca.homework.week19.job_platform;


import com.aca.homework.week19.job_platform.facade.core.OrganizationFacade;
import com.aca.homework.week19.job_platform.facade.core.UserFacade;
import com.aca.homework.week19.job_platform.facade.request.OrganizationRegistrationRequestDto;
import com.aca.homework.week19.job_platform.facade.request.UserSignUpRequestDto;
import com.aca.homework.week19.job_platform.facade.response.OrganizationDetailsDto;
import com.aca.homework.week19.job_platform.facade.response.UserDetailsDto;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@EnableJpaRepositories
@SpringBootApplication
public class Main {

    public static void main(String[] args) {
        final ConfigurableApplicationContext context = SpringApplication.run(Main.class);
        UserFacade userFacade = context.getBean(UserFacade.class);
        OrganizationFacade organizationFacade = context.getBean(OrganizationFacade.class);
        UserDetailsDto userDetailsDto = userFacade.signUp(new UserSignUpRequestDto("f", "l", "fl", "sfdgh"));
        System.out.println(userDetailsDto.toString());
        userDetailsDto = userFacade.openToWork(1L);
        System.out.println(userDetailsDto.toString());
        OrganizationDetailsDto organizationDetailsDto = organizationFacade.register(new OrganizationRegistrationRequestDto("dgf", "efdhb", "ehfds"));
        System.out.println(organizationFacade.getOrganizationDetails(1L));
    }
}
