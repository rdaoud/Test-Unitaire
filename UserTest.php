<?php

use PHPUnit\Framework\TestCase;

class UserTest extends TestCase
{

    private $user;

    public function __construct(User $user, string $name = null, array $data = [], $dataName = '')
    {
        $this->user = $user;
        parent::__construct($name, $data, $dataName);
    }

    public function TestLastname()
    {
        $user = $this->user;
        $this->assertEquals(false, $user->isValid());

        $user->setLastname('');
        $this->assertEquals(false, $user->isValid());

        $user->setLastname('Ryan');
        $this->assertEquals(true, $user->isValid());
    }

    public function TestFirstname()
    {
        $user = $this->user;
        $this->assertEquals(false, $user->isValid());

        $user->setFirstname('');
        $this->assertEquals(false, $user->isValid());

        $user->setFirstname('Daoud');
        $this->assertEquals(true, $user->isValid());
    }

    public function TestAge()
    {
        $user = $this->user;
        $this->assertEquals(false, $user->isValid());

        $user->setAge(3);
        $this->assertEquals(false, $user->isValid());

        $user->setAge(13);
        $this->assertEquals(true, $user->isValid());
    }

    public function TestEmail()
    {
        $user = $this->user;
        $this->assertEquals(false, $user->isValid());

        $user->setEmail('');
        $this->assertEquals(false, $user->isValid());

        $user->setEmail('test');
        $this->assertEquals(false, $user->isValid());

        $user->setEmail('ryan@gmail.com');
        $this->assertEquals(true, $user->isValid());
    }



}