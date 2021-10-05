package seedu.address.testutil;

import seedu.address.model.person.Gender;
import seedu.address.model.person.Name;
import seedu.address.model.person.Phone;
import seedu.address.model.person.Qualification;
import seedu.address.model.person.Tutor;
import seedu.address.model.tag.Tag;
import seedu.address.model.util.SampleDataUtil;

import java.util.HashSet;
import java.util.Set;

/**
 * A utility class to help with building Tutor objects.
 */
public class TutorBuilder {
    
    public static final String DEFAULT_GENDER = "F";
    public static final String DEFAULT_NAME = "Amy Bee";
    public static final String DEFAULT_PHONE = "85355255";
    public static final String DEFAULT_QUALIFICATION = "3";

    private Name name;
    private Phone phone;
    private Gender gender;
    private Qualification qualification;
    private Set<Tag> tags;

    /**
     * Creates a {@code TutorBuilder} with the default details.
     */
    public TutorBuilder() {
        name = new Name(DEFAULT_NAME);
        phone = new Phone(DEFAULT_PHONE);
        gender = new Gender(DEFAULT_GENDER);
        qualification = new Qualification(DEFAULT_QUALIFICATION);
        tags = new HashSet<>();
    }

    /**
     * Initializes the TutorBuilder with the data of {@code tutorToCopy}.
     */
    public TutorBuilder(Tutor tutorToCopy) {
        name = tutorToCopy.getName();
        phone = tutorToCopy.getPhone();
        gender = tutorToCopy.getGender();
        tags = new HashSet<>(tutorToCopy.getTags());
    }

    /**
     * Sets the {@code Gender} of the {@code Tutor} that we are building.
     */
    public TutorBuilder withGender(String gender) {
        this.gender = new Gender(gender);
        return this;
    }

    /**
     * Sets the {@code Name} of the {@code Tutor} that we are building.
     */
    public TutorBuilder withName(String name) {
        this.name = new Name(name);
        return this;
    }

    /**
     * Parses the {@code tags} into a {@code Set<Tag>} and set it to the {@code Tutor} that we are building.
     */
    public TutorBuilder withTags(String ... tags) {
        this.tags = SampleDataUtil.getTagSet(tags);
        return this;
    }

    /**
     * Sets the {@code Phone} of the {@code Tutor} that we are building.
     */
    public TutorBuilder withPhone(String phone) {
        this.phone = new Phone(phone);
        return this;
    }

    /**
     * Sets the {@code Qualification} of the {@code Tutor} that we are building.
     */
    public TutorBuilder withQualification(String qualification) {
        this.qualification = new Qualification(qualification);
        return this;
    }

    public Tutor build() {
        return new Tutor(name, phone, gender, qualification, tags);
    }

}