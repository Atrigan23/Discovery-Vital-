package za.ac.nwu.ac.web.sb.controller;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import za.ac.nwu.ac.domain.service.GeneralResponse;
import za.ac.nwu.ac.logic.services.impl.MemberAddMilesServices;
import za.ac.nwu.ac.logic.services.impl.MemberDeleteMiles;
import za.ac.nwu.ac.logic.services.impl.MemberMilesServices;


@RestController
@RequestMapping("Member-Type")
public class AccountSystemController {

   // private final MemberMilesServices ViewMiles;
   // private final MemberAddMilesServices AddMiles;
   // private final MemberDeleteMiles DeleteMiles;

    //@Autowired
    //public AccountSystemController(@Qualifier("MilesServices")MemberMilesServices ViewMiles, @Qualifier("AddMilesServices") MemberAddMilesServices AddMiles,@Qualifier("DeleteMilesServices") MemberDeleteMiles DeleteMiles)
    //{
        //this.ViewMiles=ViewMiles;
        //this.AddMiles = AddMiles;
       // this.DeleteMiles = DeleteMiles;
    //}


    @GetMapping("/all")
    public GeneralResponse<String> getAll() { return new GeneralResponse<String>(true,"No Types found ");


    }


}
